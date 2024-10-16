package com.mycompany.estruturasdedados;

// Classe que representa uma lista simplesmente encadeada de inteiros
public class ListaSimplesmenteEncadeada {

    Nodo inicio; // Ponto de entrada (cabeça) da lista

    // Classe interna que representa um nodo na lista
    private class Nodo {
        Integer dado; // Valor armazenado no nodo
        Nodo prox; // Referência para o próximo nodo
    }

    // Método para inserir um novo elemento no início da lista
    void insereInicio(int n) {
        Nodo novo = new Nodo(); // Cria um novo nodo
        novo.dado = n; // Armazena o dado no nodo
        novo.prox = inicio; // O próximo do novo nodo aponta para o início atual
        inicio = novo; // O início da lista agora é o novo nodo
    }

    // Método para remover o primeiro elemento da lista
    Integer removeInicio() {
        // Verifica se a lista não está vazia
        if (inicio != null) {
            int temp = inicio.dado; // Armazena o dado do nodo a ser removido
            inicio = inicio.prox; // O início agora aponta para o próximo nodo
            return temp; // Retorna o dado removido
        }
        return null; // Retorna null se a lista estiver vazia
    }

    // Método para remover um elemento específico da lista
    Integer removeMeio(int n) {
        Nodo atual = inicio; // Inicializa o nodo atual no início
        Nodo anterior = null; // Inicializa o nodo anterior como null
        // Percorre a lista até encontrar o elemento ou o final da lista
        while (atual != null && atual.dado != n) {
            anterior = atual; // Atualiza o nodo anterior
            atual = atual.prox; // Avança para o próximo nodo
        }
        // Não encontrou o elemento se o atual é null
        if (atual == null)
            return null; // Retorna null se o elemento não foi encontrado

        // Nesse ponto, sabemos que o elemento n foi encontrado
        // Verifica se o elemento está no início da lista
        if (anterior == null) {
            int x = atual.dado; // Armazena o dado do nodo a ser removido
            inicio = inicio.prox; // O início agora aponta para o próximo nodo
            return x; // Retorna o dado removido
        } else {
            int x = atual.dado; // Armazena o dado do nodo a ser removido
            anterior.prox = atual.prox; // O anterior aponta para o próximo do atual
            return x; // Retorna o dado removido
        }
    }

    // Método para imprimir a lista (método 1)
    void imprimeLista2() {
        for (Nodo temp = inicio; temp != null; temp = temp.prox) // Percorre a lista
            System.out.print(temp.dado + "->"); // Imprime cada dado seguido de "->"

        System.out.println(); // Nova linha após a impressão
    }

    // Método para imprimir a lista (método 2)
    void imprimeLista() {
        Nodo temp = inicio; // Inicializa o nodo temporário no início

        // Percorre a lista e imprime cada dado
        while (temp != null) {
            System.out.print(temp.dado + "->"); // Imprime cada dado seguido de "->"
            temp = temp.prox; // Avança para o próximo nodo
        }
        System.out.println(); // Nova linha após a impressão
    }
}
