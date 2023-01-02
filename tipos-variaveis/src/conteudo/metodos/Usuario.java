package conteudo.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);


    }
}
