package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};
        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos);
        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem Natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;
    
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato o) {
        
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
    
}
