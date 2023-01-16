package conteudo.controleCandidato;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        String [] candidatos = {"THIAGO","iGOR","MARCELO","ANA","AMANDA"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato) {
    }

    static void entrandoEmContato(){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{

            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;

            }
            else{
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas <3);

        if(atendeu){
            System.out.println("Entrando em contato com o candidato");

        }
        else{
            System.out.println("Nao conseguimos contato com o numero maxomo de tentativas: "+tentativasRealizadas);
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void ImprimirSelecionados(){
        String [] candidatos = {"THIAGO","iGOR","MARCELO","ANA","AMANDA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de numero "+ (indice+1) + " é "+ candidatos[indice]);
        }
      
    
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"THIAGO","iGOR","MARCELO","ANA","AMANDA","DUDA","FELIPE","ITSLLO","ROSE","IVAN"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados<=5 && candidatoAtual< candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato+" solicitou esse valor de salario: "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
