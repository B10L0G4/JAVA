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

    public void add(T elemento){
        noCircular<T> novoNo = new noCircular<T>(elemento);

        if (this.isEmpty()){
            this.primeiro = novoNo;
            this.ultimo = this.primeiro;
            this.ultimo.setPrimeiro(this.primeiro);
        } else {
            this.ultimo.setPrimeiro(novoNo);
            this.ultimo = novoNo;
            this.ultimo.setPrimeiro(this.primeiro);
        }
        this.tamanho++;
    }

    public void remove(int index){
        if(index >= this.tamanho) {
            throw new IndexOutOfBoundsException("A lista vazia ");
        }
        noCircular<T> aux = this.ultimo;
        if (index == 0){
            this.ultimo = this.ultimo.getPrimeiro();
            this.primeiro.setPrimeiro(this.ultimo);
        } else if (index ==1) {
            this.ultimo.setPrimeiro(this.ultimo.getPrimeiro().getPrimeiro());
        } else {
            for (int i = 0; (i < index - 1) && (aux != null); i++) {
                aux = aux.getPrimeiro();
            }
            aux.setPrimeiro(aux.getPrimeiro().getPrimeiro());
        }
        this.tamanho--;
    }
    public T get(int index){
        return this.getNo(index).getElemento();
    }
    private boolean isEmpty(){ // Verifica se a lista está vazia
        return this.tamanho == 0 ? true : false;
    }

    public int size(){ // Retorna o tamanho da lista
        return this.tamanho;
    }
    private noCircular<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        if (index == 0){
            return this.ultimo;
        }
        noCircular<T> aux = this.ultimo;
        for (int i = 0; (i < index) && (aux != null); i++) {
            aux = aux.getPrimeiro();
        }
        return aux;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        noCircular<T> aux = this.ultimo;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + aux.getElemento() + "}]--->";
            aux = aux.getPrimeiro();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;

    }


}
