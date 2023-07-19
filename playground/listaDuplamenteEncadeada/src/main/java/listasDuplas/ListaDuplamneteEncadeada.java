package listasDuplas;

public class ListaDuplamneteEncadeada<T> {

    private noDuplo<T> primeiroNo;

    private noDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public void add(T elemento){
        noDuplo<T> novoNo = new noDuplo<>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setPriveioNo(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        noDuplo<T> noAuxiliar = getNo(index);
        noDuplo<T> novoNo = new noDuplo<>(elemento);
        novoNo.setProximoNo(noAuxiliar);
        if(novoNo.getProximoNo() != null){
            novoNo.setPriveioNo(noAuxiliar.getPriveioNo());
            novoNo.getProximoNo().setPriveioNo(novoNo);
        }else{
            novoNo.setPriveioNo(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getPriveioNo().setProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if (index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setPriveioNo(null);
            }
    }else {
        noDuplo<T> noAuxiliar = getNo(index);
        noAuxiliar.getPriveioNo().setProximoNo(noAuxiliar.getProximoNo());
        if(noAuxiliar != ultimoNo){
            noAuxiliar.getProximoNo().setPriveioNo(noAuxiliar.getPriveioNo());
        }else {
            ultimoNo = noAuxiliar;
        }
    }
        tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }
    private noDuplo<T> getNo(int index){
        noDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        noDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
