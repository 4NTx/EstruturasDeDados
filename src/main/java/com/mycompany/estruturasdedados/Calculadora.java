package com.mycompany.estruturasdedados; // Declara o pacote onde a classe está localizada

// Declaração da classe Calculadora
public class Calculadora {
    // Declaração de uma pilha genérica para armazenar valores do tipo Float
    private PilhaGenerica<Float> valores;

    // Declaração de uma pilha genérica para armazenar operadores do tipo Character
    private PilhaGenerica<Character> operadores;

    // Construtor da classe Calculadora
    Calculadora() {
        // Inicializa a pilha de valores
        valores = new PilhaGenerica<Float>();

        // Inicializa a pilha de operadores
        operadores = new PilhaGenerica<Character>();
    }
}
