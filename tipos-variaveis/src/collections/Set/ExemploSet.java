package collections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        

        System.out.println("Crie um conjunto e adicione as notas : ");
    
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,8d,3.6));
    
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

         Iterator<Double> iterator = notas.iterator();
         Double soma = 0d;

         while(iterator.hasNext()){
            soma += iterator.next();
         }
         System.out.println("Exiba a soma dos valores: "+soma);
         System.out.println("Exiba a media das notas: "+ (soma/notas.size()));


    }
}
