package collections.map;
import java.util.*;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes", 115));
        }};
        for(Map.Entry<String, Livro>  livro : meusLivros.entrySet() ){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("Ordem de inserção");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia", 256));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes", 115));
        }};
        System.out.println(meusLivros2.toString());
        System.out.println("Ordem alfabetica dos autores");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);

        System.out.println(meusLivros3);
        System.out.println("Ordem alfabetica dos livros");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro:meusLivros4 ){
            System.out.println(livro.getKey() + " - "+livro.getValue());
        }
        System.out.println("ordem de pagina");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPagina());
        meusLivros5.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro:meusLivros5 ){
            System.out.println(livro.getKey() + " - "+livro.getValue());
        }



    }
}
class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        
        return o1.getValue().getNome().compareTo(o2.getValue().getNome());
    }

}
