package Listas;

public class noCircular <T> {

    private T elemento;

    private noCircular<T> primeiro;


    public noCircular(T elemento) {
        this.primeiro = null;
        this.elemento = elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public noCircular<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(noCircular<T> primeiro) {
        this.primeiro = primeiro;
    }

    @Override
    public String toString() {
        return "noCircular{" +
                "elemento=" + elemento +
                '}';
    }
}
