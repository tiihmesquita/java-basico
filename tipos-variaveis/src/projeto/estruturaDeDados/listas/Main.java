package projeto.estruturaDeDados.listas;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste 1");
        minhaListaEncadeada.add("teste 2");
        minhaListaEncadeada.add("teste 3");
        minhaListaEncadeada.add("teste 4");
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada);

    }
}
