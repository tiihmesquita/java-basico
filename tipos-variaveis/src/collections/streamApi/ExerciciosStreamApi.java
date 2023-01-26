package collections.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
              
        
        System.out.println("Pegue os 5 primeiro numeros e coloca no set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme essa lista de string em uma lista de numeros inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(t -> t % 2 == 0 && t > 2).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);
            
        System.out.println("Mostre a media dos numeros:");

        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        collectList.removeIf(integer -> (integer % 2!= 0));
        System.out.println(collectList);
        }
}
