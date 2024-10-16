package com.mycompany.estruturasdedados; // Declara o pacote onde a classe está localizada

// Declaração da classe ListaDuplamenteEncadeada que implementa uma lista encadeada duplamente
public class ListaDuplamenteEncadeada {

    Nodo inicio, ultimo; // Inicializa os nós que representam o início e o fim da lista

    // Classe interna Nodo que representa cada elemento da lista
    private class Nodo {
        Nodo proximo, anterior; // Ponteiros para o próximo e o nó anterior
        Integer dado; // Dado armazenado no nodo
    }

    // Construtor da classe ListaDuplamenteEncadeada que inicializa a lista como
    // vazia
    ListaDuplamenteEncadeada() {
        inicio = null; // O início é nulo, pois a lista está vazia
        ultimo = null; // O último é nulo, pois a lista está vazia
    }

    // Método para inserir um elemento no início da lista
    void insereInicio(Integer n) {
        Nodo novo = new Nodo(); // Cria um novo nodo
        novo.dado = n; // Define o dado do novo nodo
        novo.anterior = null; // O novo nodo será o primeiro, então não há nodo anterior

        // Verifica se a lista está vazia
        if (inicio == null) { // Se estiver vazia
            novo.proximo = null; // O novo nodo será o único, então não há próximo
            inicio = novo; // O novo nodo é o início
            ultimo = novo; // O novo nodo é também o último
        } else { // A lista já possui elementos
            inicio.anterior = novo; // O nodo que era o início agora terá um anterior
            novo.proximo = inicio; // O novo nodo apontará para o antigo início
            inicio = novo; // O novo nodo agora se torna o início
        }
    }

    // Método para inserir um elemento no final da lista
    void insereFinal(Integer n) {
        Nodo novo = new Nodo(); // Cria um novo nodo
        novo.dado = n; // Define o dado do novo nodo
        novo.proximo = null; // O novo nodo será o último, então não há próximo

        // Verifica se a lista está vazia
        if (inicio == null) { // Se estiver vazia
            novo.anterior = null; // O novo nodo será o único, então não há anterior
            inicio = novo; // O novo nodo é o início
            ultimo = novo; // O novo nodo é também o último
        } else { // A lista já possui elementos
            novo.anterior = ultimo; // O anterior do novo nodo é o último atual
            ultimo.proximo = novo; // O último atual apontará para o novo nodo
            ultimo = novo; // O novo nodo agora se torna o último
        }
    }

    // Método para remover o último elemento da lista
    Integer removeUltimo() {
        if (inicio != null) { // Verifica se a lista não está vazia
            Integer n = ultimo.dado; // Armazena o dado do último nodo

            // Verifica se há apenas um elemento na lista
            if (inicio == ultimo) { // Somente um elemento
                inicio = ultimo = null; // A lista ficará vazia
            } else { // Há mais de um elemento
                ultimo = ultimo.anterior; // Move o último nodo para o anterior
                ultimo.proximo = null; // O novo último não terá próximo
            }
            return n; // Retorna o dado do nodo removido
        } else { // Se a lista estiver vazia
            return null; // Retorna null
        }
    }

    // Método para remover um elemento do meio da lista, dado seu valor
    Integer removeMeio(int n) {
        Nodo atual = inicio; // Inicia a busca pelo primeiro nodo
        while (atual != null && atual.dado != n) { // Percorre a lista até encontrar o valor ou chegar ao final
            atual = atual.proximo; // Move para o próximo nodo
        }
        if (atual == null) // Se o nodo não foi encontrado
            return null; // Retorna null

        // Trata o caso quando é o único elemento
        if (inicio == ultimo) { // Se a lista contém apenas um elemento
            Integer x = atual.dado; // Armazena o dado do nodo a ser removido
            inicio = ultimo = null; // A lista ficará vazia
            return x; // Retorna o dado removido
        }

        // Se o elemento a ser removido é o primeiro
        if (atual.anterior == null) { // Se o nodo a ser removido é o primeiro
            Integer x = atual.dado; // Armazena o dado do nodo a ser removido
            inicio = inicio.proximo; // Atualiza o início para o próximo nodo
            inicio.anterior = null; // Remove a referência anterior do novo início
            return x; // Retorna o dado removido
        } else { // Se o nodo a ser removido não é o primeiro
            // Se o nodo a ser removido é o último
            if (atual.proximo == null) {
                Integer x = atual.dado; // Armazena o dado do nodo a ser removido
                atual.anterior.proximo = null; // Remove a referência do último nodo
                ultimo = ultimo.anterior; // Atualiza o último para o nodo anterior
                return x; // Retorna o dado removido
            }
            // Se o nodo a ser removido está no meio
            else {
                Integer x = atual.dado; // Armazena o dado do nodo a ser removido
                atual.anterior.proximo = atual.proximo; // Atualiza o anterior do nodo a ser removido
                atual.proximo.anterior = atual.anterior; // Atualiza o próximo do nodo a ser removido
                return x; // Retorna o dado removido
            }
        }
    }

    // Método para remover o primeiro elemento da lista
    Integer removeInicio() {
        if (inicio != null) { // Verifica se a lista não está vazia
            Integer n = inicio.dado; // Armazena o dado do primeiro nodo
            if (inicio == ultimo) { // Verifica se há apenas um elemento na lista
                inicio = ultimo = null; // A lista ficará vazia
            } else { // Há mais de um elemento
                inicio.proximo.anterior = null; // Remove a referência anterior do próximo nodo
                inicio = inicio.proximo; // Atualiza o início para o próximo nodo
            }
            return n; // Retorna o dado do nodo removido
        } else { // Se a lista estiver vazia
            return null; // Retorna null
        }
    }

    // Método para imprimir os elementos da lista
    void imprimeLista() {
        Nodo temp = inicio; // Inicia do início da lista

        while (temp != null) { // Percorre a lista até o final
            System.out.print(temp.dado + "->"); // Imprime o dado do nodo seguido de "->"
            temp = temp.proximo; // Move para o próximo nodo
        }
        System.out.println(); // Imprime uma nova linha após a lista
    }
}
