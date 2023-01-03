package conteudo.terminalArgumentos;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        System.out.println(nome + idade + altura);

    }
}
