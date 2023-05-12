package dio.collections.set.exeproposto2;

import java.util.Comparator;

public class OrdenarPorNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome =  o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());;
        if (ano != 0) return ano;

        return o1.getIde().compareTo(o2.getIde());
    }
}
