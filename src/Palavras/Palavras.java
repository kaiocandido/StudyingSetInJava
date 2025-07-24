package Palavras;

public class Palavras {
    //atributo
    private String palavra;

    public Palavras(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return palavra;

    }
}
