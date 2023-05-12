package dio.collections.set.exeproposto2;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().toLowerCase().compareTo(linguagemFavorita.getNome().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemFavorita)) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return getAnoDeCriacao() == that.getAnoDeCriacao() && Objects.equals(getNome(), that.getNome()) && Objects.equals(getIde(), that.getIde());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getAnoDeCriacao(), getIde());
    }
}
