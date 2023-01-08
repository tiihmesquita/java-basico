package conteudo.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(20);
        System.out.println("O aluno "+ felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}
