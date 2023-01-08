package conteudo.pessoa;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marco = new Pessoa("13308-092", "Thiago");

        marco.setEndereco("Rua das marias");
    
        System.out.println(marco.getNome() + " "+marco.getCpf());
    }

}
