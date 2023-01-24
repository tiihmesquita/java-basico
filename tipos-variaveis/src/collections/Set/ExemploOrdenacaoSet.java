package collections.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        
        System.out.println("Ordem aleatoria: ");
        Set<Serie> minhaSerie = new HashSet<>(){{
            add(new Serie("got","fantasia", 68));
            add(new Serie("dark","drama", 50));
            add(new Serie("tvd","romance", 40));
        }};

        for(Serie cada : minhaSerie)System.out.println(cada.getNome() + " - "+cada.getGenero() + " - " + cada.getTempoEpisodio());

        // ultilizando linkedHashSet para deixar em ordem de inserção
        Set<Serie> minhaSerie2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia", 68));
            add(new Serie("dark","drama", 50));
            add(new Serie("tvd","romance", 40));
        }};

        for(Serie cada : minhaSerie2)System.out.println(cada.getNome() + " - "+cada.getGenero() + " - " + cada.getTempoEpisodio());

        Set<Serie> minhaSerie3 = new TreeSet<>(minhaSerie2);
        for(Serie cada : minhaSerie3)System.out.println(cada.getNome() + " - "+cada.getGenero() + " - " + cada.getTempoEpisodio());

        System.out.println("Ordem nome/genero/tempoEpisodio");
        Set<Serie> minhaSerie4 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhaSerie4.addAll(minhaSerie);

        for(Serie serie:minhaSerie4)System.out.println(serie.getNome() + " - "+serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        int genero = o1.getGenero().compareTo(o2.getGenero());
        if(genero!=0) return genero;
        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
    
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }
    @Override
    public int compareTo(Serie o) {
        int genero = this.getGenero().compareTo(o.getGenero());
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        return tempoEpisodio != 0 ? tempoEpisodio : genero;
    }
    
}