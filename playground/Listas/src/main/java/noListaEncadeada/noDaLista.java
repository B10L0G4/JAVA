package noListaEncadeada;

public class noDaLista<T> {

    private T conteudo;
    private noDaLista proximoNo;

    public T noDaLista(){
        this.proximoNo = null;

        return null;
    }
    public noDaLista(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public noDaLista getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(noDaLista proximoNo) {
        this.proximoNo = proximoNo;
    }

        public noDaLista(T conteudo, noDaLista proximoNo){
        this.proximoNo = null;
        this.conteudo = null;
    }
    @Override
    public String toString() {
        return "noDaLista{" +
                "conteudo=" + conteudo +
                '}';
    }
    public String toStringEncadeado() {
        String str = "noDaLista{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "->null";
        }
        return str;
    }
}
