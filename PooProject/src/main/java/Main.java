import Curso.Aulas;
import Curso.Mentoria;

import java.time.LocalDateTime;

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
    }
}
