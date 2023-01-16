package projeto.estruturaDeDados.filas;

public class Main {
    public static void main(String[] args) {
        
        Fila<String> minhaFila = new Fila<>();
        
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.deQueue());
        System.out.println(minhaFila);
        minhaFila.enqueue("primeiro");
        System.out.println(minhaFila);

    }
}
