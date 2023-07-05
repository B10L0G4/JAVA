package Curso.exceptions;

public class ConteudoJaInscritoException extends Throwable {
    public ConteudoJaInscritoException() {
        System.out.println("Conteúdo já inscrito");
    }
}
