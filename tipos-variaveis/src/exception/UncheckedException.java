package exception;

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try{
                int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
                System.out.println("Resultado = "+resultado);
                continueLooping = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Entrada invalida, informe um numero inteiro");
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossivel dividir um numero por zero");
            }
            finally{
                System.out.println("Chegou no finaly");
            }
        }while(continueLooping);
        
        
        
        System.out.println("O codigo continua ...");
    
    
    }
    public static int dividir(int a, int b){
        return a/b;
    }
}
