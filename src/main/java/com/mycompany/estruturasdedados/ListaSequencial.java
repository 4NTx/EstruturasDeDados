package com.mycompany.estruturasdedados;

// Classe que representa uma lista sequencial de inteiros
public class ListaSequencial {
    private int quantidade; // Armazena a quantidade de elementos na lista
    private Integer[] dados; // Array para armazenar os dados da lista

    // Construtor que inicializa a lista com um tamanho específico
    public ListaSequencial(int tam) {
        dados = new Integer[tam]; // Cria um array de inteiros com o tamanho especificado
    }

    // Método acessório que retorna o tamanho do array de dados
    public int getTamanho() {
        return this.dados.length; // Retorna o comprimento do array
    }

    // Método que redimensiona o array de dados
    public void redimensionar(int max) {
        Integer temp[] = new Integer[max]; // Cria um novo array com o tamanho especificado
        for (int i = 0; i < this.quantidade; i++) {
            temp[i] = this.dados[i]; // Copia os elementos do array antigo para o novo
        }

        this.dados = temp; // Atribui o novo array ao atributo dados
    }

    // Método que verifica se a lista está vazia
    public boolean vazia() {
        return this.quantidade == 0; // Retorna true se a quantidade for zero
    }

    // Método para inserir um elemento no final da lista
    public void insere(int n) {
        // Verifica se o array está cheio
        if (dados.length == quantidade) {
            redimensionar(dados.length * 2); // Redimensiona o array para o dobro do tamanho
        }
        dados[quantidade] = n; // Adiciona o novo elemento ao final do array
        quantidade++; // Incrementa a quantidade de elementos
    }

    // Método para inserir um elemento no final da lista, sem redimensionar
    public void insereFixo(int n) {
        // Verifica se ainda há espaço no array
        if (dados.length != quantidade) {
            dados[quantidade] = n; // Adiciona o novo elemento ao final do array
            quantidade++; // Incrementa a quantidade de elementos
        }
    }

    // Método para imprimir os elementos da lista
    public void imprime() {
        // Percorre o array e imprime cada elemento
        for (int i = 0; i < this.quantidade; i++)
            System.out.print(dados[i] + " -> "); // Imprime o elemento seguido de " -> "
        System.out.println(); // Nova linha após a impressão
    }

    // Método para remover o primeiro elemento da lista
    public Integer removeInicio() {
        // Verifica se a lista não está vazia
        if (this.quantidade > 0) {
            int n = dados[0]; // Armazena o primeiro elemento
            this.quantidade--; // Decrementa a quantidade de elementos

            // Desloca os elementos para a esquerda para preencher o espaço
            for (int i = 1; i <= quantidade; i++) {
                dados[i - 1] = dados[i]; // Copia cada elemento para a posição anterior
            }
            return n; // Retorna o primeiro elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }

    // Método para remover o último elemento da lista
    public Integer remove() {
        // Verifica se a lista não está vazia
        if (this.quantidade > 0) {
            int n = dados[quantidade - 1]; // Armazena o último elemento
            quantidade--; // Decrementa a quantidade de elementos

            // Verifica se é necessário redimensionar o array
            if (quantidade > 0 && quantidade == dados.length / 4) {
                redimensionar(dados.length / 2); // Reduz o tamanho do array pela metade
            }
            return n; // Retorna o último elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }

    // Método para remover o último elemento da lista sem redimensionar
    public Integer removeFixo() {
        // Verifica se a lista não está vazia
        if (this.quantidade > 0) {
            int n = dados[quantidade - 1]; // Armazena o último elemento
            quantidade--; // Decrementa a quantidade de elementos
            return n; // Retorna o último elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }
}
