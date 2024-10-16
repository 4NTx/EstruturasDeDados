package com.mycompany.estruturasdedados;

// Classe responsável por testar a funcionalidade da fila genérica
public class TestaFila {

    public static void main(String[] args) {
        // Cria uma nova fila genérica com capacidade para 5 elementos
        FilaVetorGenerica<String> f = new FilaVetorGenerica<String>(5);

        // Insere elementos no final da fila
        f.insereFinal("casa");
        f.insereFinal("comida");
        f.insereFinal("compras");
        f.insereFinal("carro");
        f.insereFinal("edifício");

        // Imprime a fila após as inserções
        f.imprimeFila();

        // Remove um elemento do início da fila e imprime o elemento removido
        String r = f.removeInicio();
        System.out.println("removeu " + r);

        // Imprime a fila após a remoção
        f.imprimeFila();

        // Remove outro elemento do início da fila e imprime o elemento removido
        r = f.removeInicio();
        System.out.println("removeu " + r);

        // Imprime a fila após a remoção
        f.imprimeFila();

        // Insere mais um elemento no final da fila
        f.insereFinal("animal");
        // Imprime a fila após a inserção
        f.imprimeFila();

        // Tenta inserir mais um elemento no final da fila
        f.insereFinal("avião");
        // Imprime a fila após a inserção
        f.imprimeFila();

        // Remove mais um elemento do início da fila e imprime o elemento removido
        r = f.removeInicio();
        System.out.println("removeu " + r);

        // Imprime a fila após a remoção
        f.imprimeFila();
    }
}
