package collections.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        

        System.out.println("Crie um conjunto e adicione as notas : ");
    
        Set<Double> notas = new HashSet<>(Arrays.asList(0d,7d,8.5,9.3,5d,7d,8d,3.6));
    
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
         notas.remove(0d);
         System.out.println("Remova as notas menores que 7 e exiba a lista: ");
         Iterator<Double> iterator2 = notas.iterator();
         while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
         }
         System.out.println(notas);

         System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
         Set<Double> notas2 = new LinkedHashSet<>();
         notas2.add(2d);
         notas2.add(5d);
         notas2.add(6d);
         notas2.add(3.5);
         notas2.add(7.5);
         notas2.add(8d);
         notas2.add(9.5d);

         System.out.println(notas2);
         System.out.println("Exiba todas as notas na ordem crescente: ");
         Set<Double> notas3 = new TreeSet<>(notas2);
         System.out.println(notas3);
         notas.clear();
         System.out.println(notas.isEmpty());
    }
}
