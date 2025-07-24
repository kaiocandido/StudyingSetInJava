package Produtos;

import java.awt.desktop.SystemEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int qntd){
        produtoSet.add(new Produto(nome, codigo, preco, qntd));
    }
    //usando com ordem de nomes
    public Set<Produto> exibirPorNome(){
        Set<Produto> produtosPorOrdem = new TreeSet<>(produtoSet);
        return produtosPorOrdem;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPrecos = new TreeSet<>();
        produtoPorPrecos.addAll(produtoSet);
        return produtoPorPrecos;
    }

    //teste simples
    public static void main(String[] args) {
        CadastroProduto produtoSet = new CadastroProduto();
        produtoSet.adicionarProduto("Arroz", 123, 2020.20, 2);
        produtoSet.adicionarProduto("Feijão", 1232, 22200.20, 2);
        produtoSet.adicionarProduto("Feijão", 1232, 200.20, 2);
        System.out.println("Nomes são: " + produtoSet.exibirPorNome());
        System.out.println("Os preços são:  " + produtoSet.exibirPorPreco());


    }
}
