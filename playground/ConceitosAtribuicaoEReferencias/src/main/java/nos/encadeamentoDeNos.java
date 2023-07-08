package nos;
public class encadeamentoDeNos <T{

        private T conteudo;

        private encadeamentoDeNos<T> proximoNo;
        // o <T> é um tipo genérico, que pode ser qualquer tipo de dado
    public encadeamentoDeNos(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;

    }
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public encadeamentoDeNos getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(encadeamentoDeNos proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "encadeamentoDeNos{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }


}
