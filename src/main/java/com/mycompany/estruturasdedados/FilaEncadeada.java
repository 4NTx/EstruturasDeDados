package com.mycompany.estruturasdedados; // Declara o pacote onde a classe está localizada

// Declaração da classe FilaEncadeada
public class FilaEncadeada {

    // Declara uma variável do tipo ListaDuplamenteEncadeada que será usada para
    // implementar a fila
    ListaDuplamenteEncadeada lista;

    // Construtor da classe FilaEncadeada
    FilaEncadeada() {
        // Inicializa a lista como uma nova instância de ListaDuplamenteEncadeada
        lista = new ListaDuplamenteEncadeada();
    }

    // Método para inserir um valor no final da fila
    void insereFinal(Integer valor) {
        // Chama o método insereFinal da lista para adicionar o valor
        lista.insereFinal(valor);
    }

    // Método para remover e retornar o valor do início da fila
    Integer removeInicio() {
        // Chama o método removeInicio da lista e retorna o valor removido
        return lista.removeInicio();
    }

    // Método para imprimir os elementos da fila
    void imprimeFila() {
        // Chama o método imprimeLista da lista para imprimir os elementos
        lista.imprimeLista();
    }
}
