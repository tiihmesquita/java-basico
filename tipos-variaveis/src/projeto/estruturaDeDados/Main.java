package projeto.estruturaDeDados;

public class Main {
    public static void main(String[] args) {
        
        int intA = 1;
        int intB = intA;

        System.out.println(intB);
        intA = 2;
        System.out.println(intA);
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println( "objB = "+objB+" objA = "+objA);
        objA.setNum(2);
        System.out.println( "objB = "+objB+" objA = "+objA);
    }
}
