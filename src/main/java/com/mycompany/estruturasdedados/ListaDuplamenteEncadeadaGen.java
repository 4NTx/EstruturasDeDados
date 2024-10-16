package com.mycompany.estruturasdedados;

// Classe genérica que representa uma lista duplamente encadeada
public class ListaDuplamenteEncadeadaGen<Item> {

    // Referências para o primeiro e o último nodo da lista
    Nodo inicio, ultimo;

    // Classe interna que representa um nodo da lista
    private class Nodo {
        Nodo proximo; // Referência para o próximo nodo
        Nodo anterior; // Referência para o nodo anterior
        Item dado; // Dados armazenados no nodo
    }

    // Construtor da lista que inicializa os nodos
    ListaDuplamenteEncadeadaGen() {
        inicio = null; // Inicializa o início da lista como nulo
        ultimo = null; // Inicializa o último nodo como nulo
    }

    // Método para inserir um elemento no início da lista
    void insereInicio(Item n) {
        Nodo novo = new Nodo(); // Cria um novo nodo
        novo.dado = n; // Define o dado do novo nodo
        novo.anterior = null; // O novo nodo será o primeiro, então não há nodo anterior

        // Verifica se a lista está vazia
        if (inicio == null) {
            novo.proximo = null; // Não há próximo nodo
            inicio = novo; // O novo nodo se torna o início da lista
            ultimo = novo; // O novo nodo também é o último
        } else { // A lista já possui elementos
            inicio.anterior = novo; // Atualiza o anterior do nodo atual para o novo
            novo.proximo = inicio; // O novo nodo aponta para o antigo início
            inicio = novo; // O novo nodo agora é o início da lista
        }
    }

    // Método para inserir um elemento no final da lista
    void insereFinal(Item n) {
        Nodo novo = new Nodo(); // Cria um novo nodo
        novo.dado = n; // Define o dado do novo nodo
        novo.proximo = null; // O novo nodo será o último, então não há próximo

        // Verifica se a lista está vazia
        if (inicio == null) {
            novo.anterior = null; // Não há nodo anterior, é o primeiro
            inicio = novo; // O novo nodo se torna o início da lista
            ultimo = novo; // O novo nodo também é o último
        } else {
            novo.anterior = ultimo; // O novo nodo aponta para o antigo último
            ultimo.proximo = novo; // O antigo último agora aponta para o novo
            ultimo = novo; // O novo nodo se torna o último
        }
    }

    // Método para remover o último elemento da lista
    Item removeUltimo() {
        // Verifica se a lista não está vazia
        if (inicio != null) {
            Item n = ultimo.dado; // Armazena o dado do último nodo
            // Verifica se há apenas um elemento
            if (inicio == ultimo) { // Somente um elemento
                inicio = ultimo = null; // Limpa a lista
            } else {
                ultimo = ultimo.anterior; // Move o último para o anterior
                ultimo.proximo = null; // O novo último não tem próximo
            }
            return n; // Retorna o dado do nodo removido
        } else {
            return null; // Retorna null se a lista estiver vazia
        }
    }

    // Método para remover um elemento específico da lista
    Item removeMeio(Item n) {
        Nodo atual = inicio; // Inicia a busca pelo elemento
        // Loop para encontrar o nodo com o dado especificado
        while (atual != null && atual.dado != n) {
            atual = atual.proximo; // Avança para o próximo nodo
        }

        // Verifica se o nodo foi encontrado
        if (atual == null)
            return null; // Retorna null se não encontrar o elemento

        // Tratar quando é o único elemento
        if (inicio == ultimo) { // Apenas um elemento
            Item x = atual.dado; // Armazena o dado
            inicio = ultimo = null; // Limpa a lista
            return x; // Retorna o dado removido
        }

        // Se o nodo a ser removido é o primeiro elemento
        if (atual.anterior == null) {
            Item x = atual.dado; // Armazena o dado
            inicio = inicio.proximo; // Move o início para o próximo
            inicio.anterior = null; // O novo início não tem anterior
            return x; // Retorna o dado removido
        } else { // Se o nodo a ser removido é o último elemento
            if (atual.proximo == null) {
                Item x = atual.dado; // Armazena o dado
                atual.anterior.proximo = null; // O anterior não aponta para nada
                ultimo = ultimo.anterior; // Move o último para o anterior
                return x; // Retorna o dado removido
            }
            // Caso onde o elemento está no meio da lista
            else {
                Item x = atual.dado; // Armazena o dado
                atual.anterior.proximo = atual.proximo; // Conecta o anterior ao próximo
                atual.proximo.anterior = atual.anterior; // Conecta o próximo ao anterior
                return x; // Retorna o dado removido
            }
        }
    }

    // Método para remover o primeiro elemento da lista
    Item removeInicio() {
        // Verifica se a lista não está vazia
        if (inicio != null) {
            Item n = inicio.dado; // Armazena o dado do início
            // Verifica se há apenas um elemento
            if (inicio == ultimo) {
                inicio = ultimo = null; // Limpa a lista
            } else {
                inicio.proximo.anterior = null; // O próximo agora não tem anterior
                inicio = inicio.proximo; // Move o início para o próximo
            }
            return n; // Retorna o dado do nodo removido
        } else {
            return null; // Retorna null se a lista estiver vazia
        }
    }

    // Método para imprimir todos os elementos da lista
    void imprimeLista() {
        Nodo temp = inicio; // Inicia do início
        // Loop para percorrer a lista e imprimir os dados
        while (temp != null) {
            System.out.print(temp.dado + "->"); // Imprime o dado seguido de "->"
            temp = temp.proximo; // Avança para o próximo nodo
        }
        System.out.println(); // Nova linha após a impressão
    }
}
