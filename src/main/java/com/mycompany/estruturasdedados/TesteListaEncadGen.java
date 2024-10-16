package com.mycompany.estruturasdedados;

public class TesteListaEncadGen {

    public static void main(String[] args) {
        // Criação de uma pilha genérica para armazenar caracteres
        PilhaGenerica<Character> p = new PilhaGenerica<Character>();

        // Empilhando caracteres na pilha
        p.empilha('c');
        p.empilha('a');
        p.empilha('s');
        p.empilha('t');

        // Imprimindo o conteúdo da pilha
        p.imprimePilha(); // Deve imprimir: t s a c
    }
}
