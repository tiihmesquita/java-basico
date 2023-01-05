package conteudo.excecoes;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
    }
    catch(java.util.InputMismatchException e){
        System.out.println("Sua idade precisa ser numero");
    }
    }
}
