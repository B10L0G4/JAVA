package FifoQueue;

public class noDaFila {
    private Object object;
    private noDaFila refNoDaFila;

    public noDaFila() {

    }

    public noDaFila(Object onject) {
        this.object = onject;
        this.refNoDaFila = null;
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


    public String getObject() {
    }
}
