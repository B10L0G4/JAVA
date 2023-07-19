package Listas;

public class ListaCircular {

    private noCircular primeiro;
    private noCircular ultimo;
    private int tamanho;

    public ListaCircular(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private boolean isEmpty(){
        return this.tamanho == 0;
    }
}
