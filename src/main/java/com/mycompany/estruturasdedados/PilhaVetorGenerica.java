package com.mycompany.estruturasdedados;

// Classe que representa uma pilha utilizando um vetor genérico
public class PilhaVetorGenerica<Item> {

    private int qt; // Variável que armazena a quantidade de elementos na pilha
    private Item[] dados; // Array que armazena os elementos da pilha

    // Construtor da pilha que inicializa o vetor com um tamanho especificado
    @SuppressWarnings("unchecked") // Aviso para evitar warnings sobre tipos genéricos
    PilhaVetorGenerica(int tam) {
        this.dados = (Item[]) new Object[tam]; // Inicializa o vetor com o tamanho especificado
        this.qt = 0; // Inicializa a quantidade de elementos como 0
    }

    // Método que verifica se a pilha está vazia
    boolean eh_vazia() { // is_empty
        // Retorna true se a quantidade de elementos for 0, caso contrário, retorna
        // false
        return this.qt == 0;
    }

    // Método para adicionar um valor à pilha (empilhar)
    void empilha(Item n) { // push
        // Verifica se a pilha não está cheia antes de adicionar um novo elemento
        if (this.qt != this.dados.length) {
            this.dados[qt] = n; // Adiciona o novo elemento na posição atual da quantidade
            this.qt++; // Incrementa a quantidade de elementos
        }
    }

    // Método para remover e retornar o valor do topo da pilha (desempilhar)
    Item desempilha() { // pop
        // Verifica se a pilha não está vazia antes de remover um elemento
        if (!eh_vazia()) {
            Item n = this.dados[this.qt - 1]; // Armazena o último elemento (topo da pilha)
            this.qt--; // Decrementa a quantidade de elementos
            return n; // Retorna o elemento removido
        }
        return null; // Retorna null se a pilha estiver vazia
    }

    // Método para imprimir os elementos da pilha
    void imprimePilha() {
        // Imprime todos os elementos da pilha até a quantidade atual
        for (int i = 0; i < this.qt; i++)
            System.out.print(this.dados[i] + " "); // Imprime cada elemento seguido de um espaço
        System.out.println(); // Adiciona uma nova linha após imprimir todos os elementos
    }
}
