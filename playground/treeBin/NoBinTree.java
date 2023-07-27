package JAVA.treeBin;

public class NoBinTree<T extends Comparable<T>> {

    public T conteudo;
    private NoBinTree<T> noEsq;
    private NoBinTree<T> noDir;

    public NoBinTree(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }
    public  NoBinTree() {
    }
    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBinTree<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoBinTree<T> noEsq) {
        this.noEsq = noEsq;
    }

    public NoBinTree<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoBinTree<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "conteudo=" + conteudo +
                '}';
    }
}
