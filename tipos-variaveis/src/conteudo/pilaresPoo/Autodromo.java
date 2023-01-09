package conteudo.pilaresPoo;

public class Autodromo  {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("2424-42");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("4343-00");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
    
}
