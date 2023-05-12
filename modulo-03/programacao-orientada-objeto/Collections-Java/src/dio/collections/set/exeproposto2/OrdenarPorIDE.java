package dio.collections.set.exeproposto2;

import java.util.Comparator;

public class OrdenarPorIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().toLowerCase().compareTo(o2.getIde().toLowerCase());
    }
}
