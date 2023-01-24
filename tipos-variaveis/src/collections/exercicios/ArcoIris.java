package collections.exercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIris = new TreeSet<>();
        arcoIris.add("branco");
        arcoIris.add("azul");
        arcoIris.add("verde");
        arcoIris.add("vermelho");
        arcoIris.add("preto");
        System.out.println("Exiba as cores que o arco-iris tem: " + arcoIris);
        Integer soma = 0;
        
        Iterator<String> iterator = arcoIris.iterator();
        while(iterator.hasNext()){
            String teste = iterator.next();
            soma++;
            
        }
        
        

        System.out.println("Exiba a quantidade de cores que o arco iris tem: "+soma);
        System.out.println(arcoIris);
        Set<String> arcoIris2 = new TreeSet<>(new Comparar());
        arcoIris2.addAll(arcoIris);
        System.out.println(arcoIris2);
        for(String teste: arcoIris){
            if(teste.contains("v")){
                System.out.println(teste);
            }
            
        }
        arcoIris.clear();
        arcoIris.isEmpty();
        

    }
}

class Comparar implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        
        return o2.compareTo(o1) ;
    }

}


