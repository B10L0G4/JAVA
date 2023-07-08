package nos;
public class encadeamentoDeNos {

        private String conteudo;
        private encadeamentoDeNos proximoNo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
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

    public encadeamentoDeNos(String conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;

    }
}
