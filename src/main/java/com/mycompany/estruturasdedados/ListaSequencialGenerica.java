package com.mycompany.estruturasdedados;

// Classe genérica que representa uma lista sequencial
public class ListaSequencialGenerica<Item> {
    private int quantidade; // Número de elementos na lista
    private Item[] dados; // Array que armazena os dados da lista

    // Construtor que inicializa a lista com um tamanho especificado
    public ListaSequencialGenerica(int tam) {
        // Inicializa o array de dados com o tamanho especificado
        dados = (Item[]) new Object[tam];
    }

    // Método acessório que retorna o tamanho atual do array (capacidade)
    public int getTamanho() {
        return this.dados.length; // Retorna o comprimento do array
    }

    // Método para redimensionar o array (aumentar ou diminuir)
    public void redimensionar(int max) {
        // Cria um novo array temporário com o novo tamanho
        Item[] temp = (Item[]) new Object[max];
        // Copia os elementos existentes para o novo array
        for (int i = 0; i < this.quantidade; i++) {
            temp[i] = this.dados[i];
        }
        // Atualiza a referência do array de dados para o novo array
        this.dados = temp;
    }

    // Método que verifica se a lista está vazia
    public boolean vazia() {
        return this.quantidade == 0; // Retorna true se não há elementos
    }

    // Método que insere um novo elemento na lista
    public void insere(Item n) {
        // Verifica se o array está cheio
        if (quantidade == dados.length) { // vetor está cheio
            redimensionar(dados.length * 2); // Redimensiona o array para o dobro do tamanho
        }
        // Adiciona o novo elemento na próxima posição disponível
        dados[quantidade] = n;
        quantidade++; // Aumenta a quantidade de elementos
    }

    // Método que insere um novo elemento na lista sem redimensionar
    public void insereSemRedimensionar(Item n) {
        // Adiciona o elemento apenas se houver espaço disponível
        if (quantidade < dados.length) { // verifica se há espaço
            dados[quantidade] = n; // Adiciona o novo elemento
            quantidade++; // Aumenta a quantidade de elementos
        }
    }

    // Método que imprime todos os elementos da lista
    public void imprime() {
        // Loop que percorre todos os elementos e imprime
        for (int i = 0; i < this.quantidade; i++)
            System.out.print(dados[i] + " -> "); // Imprime o elemento seguido de " -> "
        System.out.println(); // Nova linha após a impressão
    }

    // Método que remove o primeiro elemento da lista
    public Item removeInicio() {
        // Verifica se há elementos na lista
        if (this.quantidade > 0) {
            Item n = dados[0]; // Armazena o primeiro elemento
            this.quantidade--; // Diminui a quantidade de elementos

            // Move todos os elementos uma posição para a esquerda
            for (int i = 1; i <= quantidade; i++) {
                dados[i - 1] = dados[i]; // Copia o elemento seguinte para a posição anterior
            }
            return n; // Retorna o elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }

    // Método que remove o último elemento da lista
    public Item remove() {
        // Verifica se há elementos na lista
        if (this.quantidade > 0) {
            Item n = dados[quantidade - 1]; // Armazena o último elemento
            quantidade--; // Diminui a quantidade de elementos
            // Verifica se a lista deve ser redimensionada para o tamanho menor
            if (quantidade > 0 && quantidade == dados.length / 4) {
                redimensionar(dados.length / 2); // Reduz o tamanho do array pela metade
            }
            return n; // Retorna o elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }

    // Método que remove o último elemento da lista sem redimensionar
    public Item removeFixo() {
        // Verifica se há elementos na lista
        if (this.quantidade > 0) {
            Item n = dados[quantidade - 1]; // Armazena o último elemento
            quantidade--; // Diminui a quantidade de elementos
            return n; // Retorna o elemento removido
        }
        return null; // Retorna null se a lista estiver vazia
    }
}
