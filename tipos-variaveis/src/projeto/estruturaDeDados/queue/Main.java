package projeto.estruturaDeDados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();
        
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Chevrolet"));
        System.out.println(queueCarros.add(new Carro("Citroen")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        
    }
}
