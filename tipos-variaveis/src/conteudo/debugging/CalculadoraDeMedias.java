package conteudo.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Thiago", "Marcelo"};
        double media = calculaMediaDaTurma(alunos,scan);
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma=0;
        for(String aluno: alunos){
            System.out.println("Nota do aluno "+ aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;

    }
}
