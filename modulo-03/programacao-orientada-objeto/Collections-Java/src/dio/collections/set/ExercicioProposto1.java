package dio.collections.set;

import java.util.*;

public class ExercicioProposto1 {

    public static void main (String[] args) {

        System.out.println("--\tExiba todas as cores uma abaixo da outra\t--");
        Set<String> coresArcoIris = new LinkedHashSet<String>();
        coresArcoIris.add("Vermelha");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarela");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");
        for (String cor: coresArcoIris) System.out.println(cor);

        System.out.println("--\tA quantidade de cores que o arco-íris tem\t--");
        System.out.println("Quantidade: "+coresArcoIris.size());

        System.out.println("--\tExiba as cores em ordem alfabética\t--");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("--\tExiba as cores na ordem inversa da que foi informada\t--");
        List<String> ordemInversaCores = new ArrayList<>(coresArcoIris);
        Collections.reverse(ordemInversaCores);
        System.out.println(ordemInversaCores);

        System.out.println("--\tExiba todas as cores que começam com a letra 'v'\t--");
        for (String cor: coresArcoIris) {
            if (cor.toLowerCase().startsWith("v")) System.out.println(cor);
        }

        System.out.println("--\tRemova todas as cores que não começam com a letra 'v'\t--");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if (!next.toLowerCase().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("--\tLimpe o conjunto\t--");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("--\tConfira se o conjunto está vazio\t--");
        System.out.println("Lista vazia: "+ coresArcoIris.isEmpty());
    }
}
