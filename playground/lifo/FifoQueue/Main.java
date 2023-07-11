package FifoQueue;

public class Main {
    public static void main(String[] args) {
        fila minhaFila = new fila();

        minhaFila.enqueue(new noDaFila("Primeiro"));
        minhaFila.enqueue(new noDaFila("Segundo"));
        minhaFila.enqueue(new noDaFila("Terceiro"));
        minhaFila.enqueue(new noDaFila("Quarto"));

        System.out.println(minhaFila + "\n");

        System.out.println(minhaFila.dequeue() + "\n"); // retorna o primeiro nó da fila e remove ele da fila

        System.out.println(minhaFila);

        minhaFila.enqueue(new noDaFila("Último"));

        System.out.println(minhaFila + "\n");

        System.out.println(minhaFila.first() + "\n"); // retorna o primeiro nó da fila

        System.out.println(minhaFila);







    }
}
