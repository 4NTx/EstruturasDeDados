package com.mycompany.estruturasdedados;

// Classe que representa um nodo em uma árvore binária
public class NodoArvore {
    private NodoArvore nodoEsquerdo; // Referência para o nodo à esquerda
    private Integer valor; // Valor armazenado no nodo
    private NodoArvore nodoDireito; // Referência para o nodo à direita

    // Construtor da classe que inicializa o nodo com valor e filhos
    NodoArvore(Integer valor, NodoArvore esq, NodoArvore dir) {
        this.valor = valor; // Atribui o valor ao nodo
        nodoEsquerdo = esq; // Inicializa o nodo à esquerda
        nodoDireito = dir; // Inicializa o nodo à direita
    }

    // Método que busca um valor na árvore a partir de um nodo
    boolean busca(NodoArvore nodo, Integer valor) {
        // Se o nodo é null, o valor não foi encontrado
        if (nodo == null)
            return false;
        else
        // Se o valor do nodo atual é igual ao valor buscado, retorna true
        if (nodo.valor == valor)
            return true;
        else {
            // Realiza a busca recursivamente nos nodos à esquerda e à direita
            return busca(nodo.nodoEsquerdo, valor) || // Busca à esquerda
                    busca(nodo.nodoDireito, valor); // Busca à direita
        }
    }
}
