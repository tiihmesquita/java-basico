package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

import conteudo.herancaMultipla.equipamentos.digitalizadora.Scanner;

public class ExemploList {
    public static void main(String[] args) {
        
        List<Double> notas = new ArrayList<>();

        Scanner teclado = new Scanner();

        System.out.println("Crie uma lista e adicione 7 notas de alunos");
        notas.add(7d);
        notas.add(5.0);
        notas.add(6d);
        notas.add(10.0);
        notas.add(3d);
        notas.add(4d);
        notas.add(2.0);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("tem a nota 5 na lista ? " + notas.contains(5.0));

        for(Double nota : notas){
            System.out.println(nota);
        }        

        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));

        System.out.println("Exiba a maior nota: "+ Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: "+ (soma/notas.size()));

        System.out.println("Remova a nota 0:");
        notas.remove(6.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7)iterator1.remove();
        }
        System.out.println(notas);
        System.out.println(notas.isEmpty());
        notas.clear();
        System.out.println(notas.isEmpty());
    }
}
