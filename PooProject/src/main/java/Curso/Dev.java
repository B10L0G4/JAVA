package Curso;

import Curso.exceptions.ConteudoJaInscritoException;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo) throws ConteudoJaInscritoException { // throws no método increver para que a exceção seja tratada no main
        if (conteudosInscritos.contains(conteudo)) throw new ConteudoJaInscritoException(); // se o conteúdo já estiver inscrito, lança a exceção
        else { // se não, adiciona o conteúdo na lista de conteúdos inscritos
            conteudosInscritos.add(conteudo);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(List<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public List<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(List<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

}
