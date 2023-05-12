package dio.collections.set.exeproposto2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto2 {
    public static void main (String[] args) {

        System.out.println("--\tOrdem inserção\t--");
        Set<LinguagemFavorita> listLinguagemFavorita = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1998, "eclipse"));
            add(new LinguagemFavorita("TypeScript", 2007, "VSCode"));
            add(new LinguagemFavorita("Python", 1999, "Jupter"));
        }};
        for (LinguagemFavorita linguagemFavorita: listLinguagemFavorita) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\n--\tOrdem Natural (nome)\t--");
        Set<LinguagemFavorita> listLinguagemFavorita2 = new TreeSet<>(listLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita: listLinguagemFavorita2) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\n--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> listLinguagemFavorita3 = new TreeSet<>(new OrdenarPorIDE());
        listLinguagemFavorita3.addAll(listLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita: listLinguagemFavorita3) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\n--\tOrdem por IDE\t--");
        Set<LinguagemFavorita> listLinguagemFavorita4 = new TreeSet<>(new OrdenarPorAnoNome());
        listLinguagemFavorita4.addAll(listLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita: listLinguagemFavorita4) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("\n--\tNome, ano de criacao e IDE\t--");
        Set<LinguagemFavorita> listLinguagemFavorita5 = new TreeSet<>(new OrdenarPorNomeAnoCriacaoIDE());
        listLinguagemFavorita5.addAll(listLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita: listLinguagemFavorita5) System.out.println(linguagemFavorita.getNome() + " - "
                + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
    }
}

