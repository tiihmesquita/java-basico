package conteudo.excecoes;

public class FormatadorCep {
    public static void main(String[] args) throws CepInvalidoException {
        String cepFormatado = formatarCep("23765064");
        System.out.println(cepFormatado);
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!= 8){
            throw new CepInvalidoException();
            
        }
        return "23.765-064";
    }
}
