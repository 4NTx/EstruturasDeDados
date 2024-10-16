/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturasdedados;

// Classe que representa uma pilha genérica utilizando uma lista duplamente encadeada
public class PilhaGenerica<Item> {
    // Atributo que armazena os elementos da pilha
    private ListaDuplamenteEncadeadaGen<Item> lista;

    // Construtor da pilha que inicializa a lista
    PilhaGenerica() {
        lista = new ListaDuplamenteEncadeadaGen<Item>(); // Inicializa a lista vazia
    }

    // Método para adicionar um valor à pilha (empilhar)
    void empilha(Item valor) {
        lista.insereFinal(valor); // Insere o valor no final da lista (topo da pilha)
    }

    // Método para remover e retornar o valor do topo da pilha (desempilhar)
    Item desempilha() {
        return lista.removeUltimo(); // Remove e retorna o último elemento da lista (topo da pilha)
    }

    // Método para imprimir os elementos da pilha
    void imprimePilha() {
        lista.imprimeLista(); // Chama o método para imprimir a lista
    }
}
