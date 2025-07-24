package Convite;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adcConvidado(String name, int codigoConvite){
        convidadoSet.add(new Convidado(name, codigoConvite));
    }

    public void removerConvidadoCodigo(int conviteCodigo){
        Convidado conviadoRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == conviteCodigo){
                conviadoRemover = c;
                break;
            }
        }
        convidadoSet.remove(conviadoRemover);
    }

    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    //teste simples
    public static void main(String[] args) {
        ConjuntoConvidados convidadoSet = new ConjuntoConvidados();
        convidadoSet.adcConvidado("kaio", 22);
        convidadoSet.adcConvidado("Iago", 232);
        convidadoSet.adcConvidado("Thiago", 1111);
        convidadoSet.adcConvidado("Vinicius", 1111);
        convidadoSet.contarConvidados();
        convidadoSet.exibirConvidados();
        convidadoSet.removerConvidadoCodigo(22);
        convidadoSet.exibirConvidados();
        convidadoSet.contarConvidados();
    }
}
