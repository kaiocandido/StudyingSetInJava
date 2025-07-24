package Palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    //atributo
    private Set<Palavras> palavraSet;

    public ConjuntoDePalavras() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        Palavras removerPalavrasSet = null;
        for (Palavras l : palavraSet){
            if (l.getPalavra() == palavra){
                removerPalavrasSet = l;
                break;
            }
        }
        palavraSet.remove(removerPalavrasSet);
    }

    public void verificarPalavra(String palavra){
        for (Palavras l : palavraSet){
            if (l.getPalavra() == palavra){
                System.out.println("A palavra buscada: " + palavra + " Existe!!!!");
                break;
            }else{
                System.out.println("A palavra não existe");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas(){
        for (Palavras i : palavraSet){
            System.out.println(i);
        }
    }

    public void exibirSetWords(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoDePalavras palavraSet = new ConjuntoDePalavras();
        palavraSet.adicionarPalavra("Carro");
        palavraSet.adicionarPalavra("moto");
        palavraSet.adicionarPalavra("Cidade");
        palavraSet.adicionarPalavra("Maua");
        palavraSet.adicionarPalavra("verificarPalavra");
        palavraSet.exibirSetWords();
        palavraSet.removerPalavra("verificarPalavra");
        palavraSet.exibirSetWords();
        palavraSet.verificarPalavra("verificarPalavra");
        palavraSet.exibirPalavrasUnicas();

    }
}
