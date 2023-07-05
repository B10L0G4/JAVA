import Curso.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// TODO: Preparar parde de front


public class Main {
    public static void main(String[] args) {

        Aulas aulasJava = new Aulas();
        aulasJava.setTitulo("Java Basico"); // set atribui valor
        aulasJava.setDescricao("Conceitos basicos de Java");
        aulasJava.setCargaHoraria(8);

        Aulas aulasJavaIntermediario = new Aulas();
        aulasJava.setTitulo("Java Intermediario");
        aulasJava.setDescricao("Conceitos intermediarios de Java");
        aulasJava.setCargaHoraria(8);

        Aulas aulasPython = new Aulas();
        aulasJava.setTitulo("Python Basico");
        aulasJava.setDescricao("Conceitos basicos de Python");
        aulasJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Orientação de Java e POO");
        mentoriaJava.setDescricao("Usando os pilares de POO com Java");
        mentoriaJava.setData(LocalDateTime.now());

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Orientação de Python");
        mentoriaPython.setDescricao("Conceitos de Basicos Python ");
        mentoriaPython.setData(LocalDateTime.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDataInicio(LocalDate.now());
        bootCamp.setDataFim(LocalDate.now().plusDays(45));
        List<Conteudo> conteudosBootCamp = Arrays.asList(aulasJava, aulasJavaIntermediario,mentoriaJava);
        bootCamp.setConteudos(conteudosBootCamp);

        Dev Sonic = new Dev();
        Sonic.setNome("Sonic");

        Dev Amy = new Dev();
        Amy.setNome("Amy");


        Sonic.inscrever(aulasPython);
        Sonic.inscrever(mentoriaPython);


        Amy.inscrever(aulasJava);
        Amy.inscrever(bootCamp);

        Amy.progredir();
        Amy.progredir();
        Amy.progredir();

        Sonic.progredir();
        Sonic.progredir();

        System.out.println("Conteudos inscritos do Sonic: " + Sonic.getConteudosInscritos());
        System.out.println("Conteudos inscrito da Amy: " + Amy.getConteudosInscritos());

        List<Dev> ranking = Arrays.asList(Sonic, Amy).stream()
                .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
                .collect(Collectors.toList());
        for (Dev dev : ranking) {
            System.out.println(dev.getNome());
            System.out.println(dev.calcularTotalXp());
        }





    }
}
