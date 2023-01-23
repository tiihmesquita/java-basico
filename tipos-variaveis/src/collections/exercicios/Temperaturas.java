package collections.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import conteudo.herancaMultipla.equipamentos.digitalizadora.Scanner;

public class Temperaturas {
    public static void main(String[] args) {

        

        List<Double> temp = new ArrayList<>();

       
            System.out.println("Janeiro: ");
            temp.add(30d);
            System.out.println("Fevereiro: ");
            temp.add(29.5);
            System.out.println("Março: ");
            temp.add(28.0);
            System.out.println("Abril: ");
            temp.add(29.0);
            System.out.println("Maio: ");
            temp.add(31.6);
            System.out.println("Junho: ");
            temp.add(30.2);
            Double soma = 0d;

            Iterator<Double> iterator = temp.iterator();
            while(iterator.hasNext()){
                Double next = iterator.next();
                soma +=next;
            }
            System.out.println("Media : " + (soma/temp.size()));

        System.out.println(temp);
    }
}
