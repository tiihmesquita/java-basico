package projeto.estruturaDeDados.filas;

public class Main {
    public static void main(String[] args) {
        
        Fila minhaFila = new Fila();
        
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.deQueue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new No("primeiro"));
        System.out.println(minhaFila);

    }
}
