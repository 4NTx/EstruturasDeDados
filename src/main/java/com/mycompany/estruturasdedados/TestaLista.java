package com.mycompany.estruturasdedados;

// Classe responsável por testar a funcionalidade da lista sequencial
public class TestaLista {

    public static void main(String[] args) {

        // Cria uma nova lista sequencial com capacidade inicial para 5 elementos
        ListaSequencial lista = new ListaSequencial(5);

        // Verifica se a lista está vazia e imprime o resultado
        System.out.println("lista vazia = " + lista.vazia());

        // Insere elementos na lista
        lista.insere(7);
        lista.insere(10);
        lista.insere(15);
        lista.insere(20);
        lista.insere(25);

        // Tenta inserir mais elementos, o que deve redimensionar a lista
        lista.insere(6);
        lista.insere(88);

        // Imprime os elementos da lista
        lista.imprime();

        // Imprime o tamanho atual da lista
        System.out.println("tam: " + lista.getTamanho());

        // Remove cinco elementos da lista
        lista.remove();
        lista.remove();
        lista.remove();
        lista.remove();
        lista.remove();

        // Imprime a lista após as remoções
        lista.imprime();

        // Imprime o tamanho da lista após as remoções
        System.out.println("tam: " + lista.getTamanho());
    }
}
