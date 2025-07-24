package Agenda;

import Convite.Convidado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoset;

    public AgendaContatos() {
        this.contatoset = new HashSet<>();
    }

    public void adicionarContato(String name, int numero){
        contatoset.add(new Contato(name, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoset);
    }

    public void pesquisarPorNumero(int numero){
        for (Contato c : contatoset){
            if (c.getNumero() == numero){
                System.out.println(c);
            }
        }
    }

    public Set<Contato> buscarPorNome(String name){
        Set<Contato> contatosPorname = new HashSet<>();
        for (Contato c : contatoset){
            if (c.getName().startsWith(name)){
                contatosPorname.add(c);
            }
        }
        return contatosPorname;
    }

    public Contato AtualizarNumeroContato(String name, int newNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoset){
            if (c.getName().equalsIgnoreCase(name)){
                c.setNumero(newNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contatoset = new AgendaContatos();
        contatoset.adicionarContato("Kaio", 1111111111);
        contatoset.adicionarContato("Douglas", 1111122221);
        contatoset.adicionarContato("Douglas", 202122221);
        contatoset.adicionarContato("Douglas", 112222221);
        contatoset.exibirContatos();
        contatoset.pesquisarPorNumero(1111111111);
        contatoset.buscarPorNome("Do");
        contatoset.AtualizarNumeroContato("Kaio", 2222);
        contatoset.exibirContatos();
    }
}
