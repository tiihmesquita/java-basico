package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        System.out.println("Ordem Idade");

        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("Ordem cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("Ordem Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
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

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
        
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }

}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato o1, Gato o2) {
       
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }


}
class ComparatorNomeCorIdade implements Comparator<Gato>{

   

    @Override
    public int compare(Gato o1, Gato o2) {
       int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
       if(nome != 0)  return nome;
       int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
       if(cor != 0) return cor;
       return Integer.compare(o1.getIdade(),o2.getIdade());
    }

}