package Produtos;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long codigo;
    private double preco;
    private int qntd;

    public Produto(String nome, long codigo, double preco, int qntd) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public double getPreco() {
        return preco;
    }

    public int getQntd() {
        return qntd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", qntd=" + qntd +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
