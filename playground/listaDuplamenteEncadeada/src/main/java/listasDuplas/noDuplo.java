package listasDuplas;

public class noDuplo<T> {

    private T conteudo;
    private noDuplo<T> proximoNo;
    private noDuplo<T> priveioNo;

    public noDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public noDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(noDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public noDuplo<T> getPriveioNo() {
        return priveioNo;
    }

    public void setPriveioNo(noDuplo<T> priveioNo) {
        this.priveioNo = priveioNo;
    }

    @Override
    public String toString() {
        return "noDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
