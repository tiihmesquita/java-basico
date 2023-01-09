package conteudo.mensagensInstantanea;

public class MsnMessenger extends SevicoMensagemInstantanea{

    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
    
}
