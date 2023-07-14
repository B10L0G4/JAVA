package noListaEncadeada;

public class ListaEncadeada<T> {
    noDaLista<T> refEntrada;
    public ListaEncadeada(){
        this.refEntrada = null;
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
    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

}
