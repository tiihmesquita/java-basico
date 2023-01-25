package collections.map;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivosvalores: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.5);
            put("mobi",10.0);
            put("hb20",16.1);
            put("kwid",13.4);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.3);
        System.out.println(carrosPopulares);
        System.out.println("Confira se o modelo tucson está no dicionário: "+carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: "+ carrosPopulares.get("uno"));
        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);
        System.out.println("Exiba o modelos mais economico e seu consumo;");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";
        
        for(Map.Entry<String, Double> entrie : entries){
            if(entrie.getValue().equals(consumoMaisEficiente)) {
            modeloMaisEficiente = entrie.getKey();
            }
        }
        System.out.println(modeloMaisEficiente);
        System.out.println("Exiba o modelo menos economico e seu consumo");

        Double menorConsumo = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entrie : carrosPopulares.entrySet()){
            if(entrie.getValue().equals(menorConsumo)){
            modeloMenosEficiente = entrie.getKey();
            }
            
            
        }
        System.out.println(modeloMenosEficiente + menorConsumo);
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos : " + soma);
        System.out.println("Exiba a media dos consumos: " + (soma/carrosPopulares.size()));

        Iterator<Double> iterator3 = carrosPopulares.values().iterator();

        while(iterator3.hasNext()){
            if(iterator3.next().equals(15.5)){
                iterator3.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println("Exiba todos os carros na ordem em que foram adicionados");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.5);
            put("mobi",10.0);
            put("hb20",16.1);
            put("kwid",13.4);
        }};
        System.out.println(carrosPopulares2);
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());
        System.out.println("Apague o dicionario carros");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionario esta vazio: ");
        System.out.println(carrosPopulares.isEmpty());
    }
}
