package Convite;

import java.util.Objects;

public class Convidado {
    //atributos
    private String name;
    private int codigoConvite;

    public Convidado(String name, int codigoConvite) {
        this.name = name;
        this.codigoConvite = codigoConvite;
    }

    public String getName() {
        return name;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
