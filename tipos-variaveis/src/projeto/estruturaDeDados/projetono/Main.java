package projeto.estruturaDeDados.projetono;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("conteudo no1");
        No no2 = new No("conteudo no2");
        no1.setProximoNo(no2);
        No no3 = new No("conteudo no3");
        no2.setProximoNo(no3);
        No no4 = new No("conteudo no4");
        no3.setProximoNo(no4);
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("--------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
    }
}
