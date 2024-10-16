package com.mycompany.estruturasdedados; // Declara o pacote onde a classe está localizada

// Declaração da classe FilaVetor
public class FilaVetor {

    private int ini, qt; // 'ini' é o índice do início da fila, 'qt' é a quantidade de elementos na fila
    private Integer[] dados; // Array para armazenar os elementos da fila

    // Construtor da classe FilaVetor que inicializa a fila com um tamanho
    // especificado
    FilaVetor(int tam) {
        ini = qt = 0; // Inicializa o início da fila e a quantidade de elementos como zero
        dados = new Integer[tam]; // Cria um array de Integers com o tamanho especificado
    }

    // Método para inserir um elemento no final da fila
    void insereFinal(int n) {
        if (qt != dados.length) { // Verifica se a fila não está cheia
            int pos = (ini + qt) % dados.length; // Calcula a posição onde o novo elemento deve ser inserido
            dados[pos] = n; // Insere o elemento na posição calculada
            qt++; // Incrementa a quantidade de elementos na fila
            System.out.println("inseriu " + n); // Imprime a confirmação da inserção
            // Pode inserir
        }
        // Não pode inserir se a fila estiver cheia
    }

    // Método para remover e retornar o elemento do início da fila
    Integer removeInicio() {
        if (qt != 0) { // Verifica se a fila não está vazia
            Integer n = dados[ini]; // Armazena o valor que será removido
            // dados[ini] = null; // Esta linha pode ser utilizada para liberar a referência
            // (opcional)
            ini = (ini + 1) % dados.length; // Atualiza o índice do início da fila
            qt--; // Decrementa a quantidade de elementos na fila
            return n; // Retorna o valor removido
            // Pode remover
        }
        // Não pode remover se a fila estiver vazia
        return null; // Retorna null se a fila estiver vazia
    }

    // Método para imprimir os elementos da fila
    void imprimeFila() {
        int tam = dados.length; // Armazena o tamanho do array
        int fim = (ini + qt) % tam; // Calcula o índice do final da fila
        for (int i = ini; i != fim; i = (i + 1) % tam) { // Itera pelos elementos da fila
            System.out.print(dados[i] + "->"); // Imprime cada elemento seguido de "->"
        }
    }

    // Método alternativo para imprimir os elementos da fila
    void imprimeFilaNovo() {
        int i = ini; // Inicializa o índice 'i' como o início da fila
        int j = 0; // Contador de elementos impressos
        while (j < qt) { // Enquanto houver elementos na fila
            System.out.print(dados[i] + "->"); // Imprime o elemento na posição 'i'
            i = (i + 1) % dados.length; // Atualiza o índice 'i' para o próximo elemento
            j++; // Incrementa o contador
        }
    }

    // Método para imprimir todos os elementos do array, incluindo os que não estão
    // na fila
    void imprimeFilaBackup() {
        for (int i = 0; i < dados.length; i++) { // Itera por todo o array
            System.out.print(dados[i] + "->"); // Imprime cada elemento seguido de "->"
        }
        System.out.println(); // Imprime uma nova linha no final
    }
}
