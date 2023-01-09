package conteudo.mensagensInstantanea;

public class CoumputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
		SevicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
			smi = new MsnMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
