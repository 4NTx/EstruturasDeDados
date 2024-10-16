package com.mycompany.estruturasdedados; // Declara o pacote onde a classe está localizada

// Declaração da classe FilaVetorGenerica que utiliza generics para permitir qualquer tipo de item
public class FilaVetorGenerica<Item> {

    private int ini, qt; // 'ini' é o índice do início da fila, 'qt' é a quantidade de elementos na fila
    private Item[] dados; // Array para armazenar os elementos da fila

    // Construtor da classe FilaVetorGenerica que inicializa a fila com um tamanho
    // especificado
    FilaVetorGenerica(int tam) {
        ini = qt = 0; // Inicializa o início da fila e a quantidade de elementos como zero
        dados = (Item[]) new Object[tam]; // Cria um array de objetos e faz um cast para o tipo genérico Item
        // Instancia um objeto do tipo Object e transforma esse objeto em um vetor de
        // itens
    }

    // Método para inserir um elemento no final da fila
    void insereFinal(Item n) {
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
    Item removeInicio() {
        if (qt != 0) { // Verifica se a fila não está vazia
            Item n = dados[ini]; // Armazena o valor que será removido
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
}
