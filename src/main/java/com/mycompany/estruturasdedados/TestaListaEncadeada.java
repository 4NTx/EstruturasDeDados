package com.mycompany.estruturasdedados;

import com.mycompany.estruturasdedados.ListaSimplesmenteEncadeada;

// Classe responsável por testar a funcionalidade da pilha e fila encadeadas
public class TestaListaEncadeada {
    public static void main(String[] args) {

        // Cria uma nova pilha encadeada e uma fila encadeada
        PilhaEncadeada p = new PilhaEncadeada();
        FilaEncadeada f = new FilaEncadeada();

        // Empilha três elementos na pilha
        p.empilha(7);
        p.empilha(8);
        p.empilha(20);

        // Imprime o estado atual da pilha
        p.imprimePilha();

        // Desempilha um elemento e insere na fila, repetindo para todos os elementos
        f.insereFinal(p.desempilha());
        p.imprimePilha();

        f.insereFinal(p.desempilha());
        p.imprimePilha();

        f.insereFinal(p.desempilha());
        p.imprimePilha();

        // O último desempilhado não deve ser inserido na fila pois a pilha agora está
        // vazia
        f.insereFinal(p.desempilha());
        p.imprimePilha();

        // Imprime o estado atual da fila
        f.imprimeFila();
    }
}
