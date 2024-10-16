package com.mycompany.estruturasdedados;

// Classe responsável por testar a funcionalidade da lista duplamente encadeada
public class TestaDuplamenteEncadeada {

    public static void main(String[] args) {
        // Cria uma nova lista duplamente encadeada
        ListaDuplamenteEncadeada lis = new ListaDuplamenteEncadeada();

        // Insere elementos no início da lista
        lis.insereInicio(8);
        lis.insereInicio(9);

        // Insere elementos no final da lista
        lis.insereFinal(10);
        lis.insereFinal(15);

        // Imprime a lista após inserções
        lis.imprimeLista();

        // Remove o elemento 10 do meio da lista e imprime o elemento removido
        System.out.println("removeu " + lis.removeMeio(10));
        lis.imprimeLista();

        // Tenta remover um elemento que não está na lista (77) e imprime o resultado
        System.out.println("removeu " + lis.removeMeio(77));
        lis.imprimeLista();

        // Remove o elemento 9 do meio da lista e imprime o elemento removido
        System.out.println("removeu " + lis.removeMeio(9));
        lis.imprimeLista();

        // Remove o elemento 15 do meio da lista e imprime o elemento removido
        System.out.println("removeu " + lis.removeMeio(15));
        lis.imprimeLista();

        // Remove o elemento 8 do meio da lista e imprime o elemento removido
        System.out.println("removeu " + lis.removeMeio(8));
        lis.imprimeLista();

        // O código abaixo foi comentado, mas poderia ser utilizado para remover do
        // início da lista
        // System.out.println("removeu " + lis.removeInicio());
    }
}
