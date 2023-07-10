package stackExemplo;

public class noDapilha {

    private int data;
    private noDapilha reNew;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public noDapilha getReNew() {
        return reNew;
    }

    public void setReNew(noDapilha reNew) {
        this.reNew = reNew;
    }

    public noDapilha(int data) {
        this.data = data;
    }
}
