package conteudo.operadores;

public class Operadores{
public static void main(String[] args) {
    
   
    int a =3, b=4;
    String resultado = a==b ? "Verdadeira" : "Falso";
    System.out.println(resultado);
    System.out.println(somar(a,b));



}
public static double somar (int num1, int num2){


    return num1 + num2;
}
}