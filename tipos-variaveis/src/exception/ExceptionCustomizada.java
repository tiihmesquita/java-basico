package exception;

import javax.swing.JOptionPane;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};
        for(int i = 0; i < denominador.length;i++){

            try{
                if(numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisao nao exata!",numerador[i],denominador[i]);
                if(denominador[i] == 0) throw new DivisaoPorZero("Impossivel dividir numero por zero", numerador[i], denominador[i]);
                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado);
            }catch(DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch(DivisaoPorZero o){
                o.printStackTrace();
                JOptionPane.showMessageDialog(null,o.getMessage());
            }
            

           
        }

        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception{
    private int numerado;
    private int denominador;


    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }


}
class DivisaoPorZero extends Exception{
    private int numerado;
    private int denominador;


    public DivisaoPorZero(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}
