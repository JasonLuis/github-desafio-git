package dio.collections.map;

import java.util.*;

public class ExercicioProposto {

    public static void main (String[] args) {

        System.out.println("--\tCrie um dicionário e relacione os estados e suas populações;\t--");
        Map<String, Integer> estados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados.toString());
        System.out.println("");

        System.out.println("--\tSubstitua a população do estado do RN por 3.534.165;;\t--");
        estados.put("RN", 3534165);
        System.out.println(estados.toString());
        System.out.println("");

        System.out.println("--\tConfira se o estado PB está no dicionário, caso não adicione: PB -\n" + "4.039.277\t--");
        if (!estados.containsKey("PB")) estados.put("PB", 4039277);
        System.out.println(estados.toString());
        System.out.println("");

        System.out.println("--\tExiba a população PE;\t--");
        System.out.println(estados.get("PE"));
        System.out.println("");

        System.out.println("--\tExiba todos os estados e suas populações na ordem que foi\n" +
                "informado\t--");
        Map<String, Integer> estados1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados1.toString());
        System.out.println("");

        System.out.println("--\tExiba os estados e suas populações em ordem alfabética\t--");
        Map<String, Integer> estados2 = new TreeMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2.toString());
        System.out.println("");

        System.out.println("--\tExiba o estado com o menor população e sua quantidade\t--");
        int qtdPopulacaoMenor = Collections.min(estados.values());
        String estadoPopulacaoMenor = "";
        for (Map.Entry<String, Integer> entry: estados.entrySet()) {
            if(entry.getValue().equals(qtdPopulacaoMenor)) {
                estadoPopulacaoMenor = entry.getKey();
            }
        }
        System.out.println("Estado com a menor população: " + estadoPopulacaoMenor + " - " + qtdPopulacaoMenor);
        System.out.println("");

        System.out.println("--\tExiba o estado com a maior população e sua quantidade\t--");
        int qtdPopulacaoMaior = Collections.max(estados.values());
        String estadoPopulacaoMaior = "";
        for (Map.Entry<String, Integer> entry: estados.entrySet()) {
            if(entry.getValue().equals(qtdPopulacaoMaior)) {
                estadoPopulacaoMaior = entry.getKey();
            }
        }
        System.out.println("Estado com a maior população: " + estadoPopulacaoMaior + " - " + qtdPopulacaoMaior);
        System.out.println("");

        System.out.println("--\tExiba a soma da população desses estados\t--");
        Iterator<Integer> iterator = estados.values().iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: "+soma);
        System.out.println("");

        System.out.println("--\tExiba a média da população deste dicionário de estados\t--");
        System.out.println("Média: "+ (soma/estados.size()));
        System.out.println("");

        System.out.println("--\tRemova os estados com a população menor que 4.000.000\t--");
        System.out.println("antes: "+ estados.toString());
        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println("depois: "+ estados.toString());
        System.out.println("");

        System.out.println("--\tApague o dicionário de estados\t--");
        System.out.println("antes: "+ estados.toString());
        estados.clear();
        System.out.println("depois: "+ estados.toString());
        System.out.println("");

        System.out.println("--\tConfira se o dicionário está vazio\t--");
        System.out.println("Dicionario vazio? "+estados.isEmpty());
    }
}
