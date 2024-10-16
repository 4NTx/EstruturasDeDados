package com.mycompany.estruturasdedados;

public class TestaPilha {

    public static void main(String[] args) {

        // Criação de uma pilha genérica para armazenar Strings com capacidade inicial
        // de 5 elementos
        PilhaVetorGenerica<String> p = new PilhaVetorGenerica<String>(5);

        // Empilhando elementos na pilha
        p.empilha("a");
        p.empilha("b");
        p.empilha("c");
        p.empilha("d");
        p.empilha("e");
        // O próximo elemento ("f") não será empilhado, pois a pilha já está cheia
        p.empilha("f");

        // Imprimindo o conteúdo da pilha
        p.imprimePilha();

        // Desempilhando dois elementos da pilha e imprimindo-os
        System.out.println(p.desempilha()); // Deve imprimir "e"
        System.out.println(p.desempilha()); // Deve imprimir "d"
    }
}
