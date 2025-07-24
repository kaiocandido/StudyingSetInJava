package Agenda;

import java.util.Objects;

public class Contato {
    //atributos
    private String name;
    private int numero;

    public Contato(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getName() {
        return name;
    }

    // não deixa ter numeros reptidos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public String toString() {
        return "Contato: " + name + "numero: " + numero + "\n";

    }
}
