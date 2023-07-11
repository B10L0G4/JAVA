package FifoQueue;

public class noDaFila<T> {
    private T object;
    private noDaFila<T> refNoDaFila;

    public noDaFila() {

    }

    public noDaFila(T onject) {
        this.object = onject;
        this.refNoDaFila = null;
    }

    public Object getObject() {
        return object;
    }

    public noDaFila getRefNoDaFila() {
        return refNoDaFila;
    }

    public void setRefNoDaFila(noDaFila refNoDaFila) {
        this.refNoDaFila = refNoDaFila;
    }

    @Override
    public String toString() {
        return "noDaFila{" +
                "object=" + object +
                '}';
    }



}
