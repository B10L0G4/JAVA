package ModeloDeEncapsulamento;


public class SistemaDeMensagemFirst extends PadraoSistemaDeMensagem{

    @Override
    public void enviarMensagem() {
        validarconexao();
        System.out.println("Enviando mensagem pelo MSN.");
        salvarHistorico();
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN.");
        salvarHistorico();
    }

    private void validarconexao () {
        System.out.println("Validando Conexão com a internet ...");
    }
    private void salvarHistorico () {
        System.out.println("Salvando Histórico de conversas");
    }

}
