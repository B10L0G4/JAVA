package FifoQueue;

public class fila {
    private noDaFila refNoDaFilaEntrada;

    public fila() {
        this.refNoDaFilaEntrada = null;
    }

    public void enqueue(noDaFila novoNo){
        novoNo.setRefNoDaFila(refNoDaFilaEntrada);
        refNoDaFilaEntrada = novoNo;
    }
    public void first(){

    }
    public boolean isEmpty(){
        return refNoDaFilaEntrada == null ? true : false;
    }
}
