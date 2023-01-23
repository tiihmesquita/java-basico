package collections.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Interrogatorio {
    public static void main(String[] args) {
        List<String> interrogar = new ArrayList<>();
        System.out.println("Telefonou para a vitima ?");
        interrogar.add("n");
        System.out.println("Esteve no local do crime ?");
        interrogar.add("s");
        System.out.println(("Mora perto da vitima ?"));
        interrogar.add("s");
        System.out.println("Devia para a vitima ?");
        interrogar.add("n");
        System.out.println("Ja trabalhou com a vitima ?");
        interrogar.add("n");
        System.out.println(interrogar);
        Iterator<String> iterator = interrogar.iterator();
        int teste = 0;
        while(iterator.hasNext()){
            if(iterator.next()=="s"){
                teste++;
            }
        }
        if(teste == 2){
            System.out.println("Suspeita");
        }else if (teste >=3 && teste <=4){
            System.out.println("Cumplice");
        }else if(teste == 5){
            System.out.println("Assassina");

        }else{
            System.out.println("Inocente");
        }
    }
}
