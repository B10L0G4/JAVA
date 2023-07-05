package Curso;

import Curso.exceptions.ConteudoJaInscritoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo)  { // throws no método increver para que a exceção seja tratada no main
        if (conteudosInscritos.contains(conteudo))
            try {
                throw new ConteudoJaInscritoException(); // se o conteúdo já estiver inscrito, lança a exceção
            } catch (ConteudoJaInscritoException e) {
                throw new RuntimeException(e);
            }
        else { // se não, adiciona o conteúdo na lista de conteúdos inscritos
            conteudosInscritos.add(conteudo);
        }
    }

    public void inscrever(BootCamp bootcamp) {
        // percorre a lista de conteúdos do bootcamp de forma tradicional
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            // se o conteúdo não estiver inscrito, inscreve
            if (!conteudosInscritos.contains(conteudo)) {
                conteudosInscritos.add(conteudo);
            }
        }
        bootcamp.getDevs().add(this);
//        // percorre a lista de conteúdos do bootcamp usando stream (stream é uma API que permite percorrer coleções)
//        bootcamp.getConteudos().stream().forEach(this::inscrever);
//        // percorre a lista de conteúdos do bootcamp usando stream e filter

    }
    public void progredir() {
        Optional<Conteudo>conteudo = conteudosInscritos.stream().findFirst();// pega o primeiro conteúdo da lista de conteúdos inscritos
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
            // se o conteúdo estiver presente, adiciona na lista de conteúdos concluídos e remove da lista de conteúdos inscritos
        } else {
            System.err.println("Não há conteúdos para progredir");
        }
    }
    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
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
