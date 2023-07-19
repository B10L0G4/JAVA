package Listas;

public class ListaCircular <T>{

    private noCircular<T> primeiro;
    private noCircular<T> ultimo;
    private int tamanho;

    public ListaCircular(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private boolean isEmpty(){ // Verifica se a lista está vazia
        return this.tamanho == 0 ? true : false;

    }

    public int size(){ // Retorna o tamanho da lista
        return this.tamanho;
    }
}
