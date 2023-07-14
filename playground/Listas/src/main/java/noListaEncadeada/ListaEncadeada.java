package noListaEncadeada;

public class ListaEncadeada<T> {
    noDaLista<T> refEntrada;
    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        noDaLista<T> novoNo = new noDaLista<>(conteudo);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }
        noDaLista<T> noAuxiliar = refEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private noDaLista<T> getNo(int index){
        validaIndice(index);
        noDaLista<T> noAuxiliar = refEntrada;
        noDaLista<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public int size(){
        int tamanhoLista = 0;
        noDaLista<T> refAuxiliar = refEntrada;
        while(true){
            if(refAuxiliar != null){
                tamanhoLista++;
                if(refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "
                    + index + " desta lista. Esta lista só vai até o índice "
                    + ultimoIndice + ".");
        }
    }
    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

}
