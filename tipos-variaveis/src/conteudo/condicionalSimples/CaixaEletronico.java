package conteudo.condicionalSimples;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.5;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
        System.out.println(saldo);
    }

}
