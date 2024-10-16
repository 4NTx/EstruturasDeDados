package com.mycompany.estruturasdedados;

public class TestaNodoArvore {

    public static void main(String[] args) {

        // Criação dos nodos da árvore
        NodoArvore d = new NodoArvore(20, null, null); // Nodo folha com valor 20
        NodoArvore e = new NodoArvore(35, null, null); // Nodo folha com valor 35
        NodoArvore f = new NodoArvore(50, null, null); // Nodo folha com valor 50
        NodoArvore g = new NodoArvore(16, null, null); // Nodo folha com valor 16

        // Criação dos nodos internos
        NodoArvore b = new NodoArvore(10, d, e); // Nodo com valor 10, com filhos 20 e 35
        NodoArvore a = new NodoArvore(8, f, g); // Nodo com valor 8, com filhos 50 e 16
        NodoArvore h = new NodoArvore(15, b, a); // Raiz da árvore com valor 15, com filhos 10 e 8

        // Busca o valor 16 na árvore
        System.out.println(h.busca(h, 16)); // Deve retornar true, pois 16 está na árvore
    }
}
