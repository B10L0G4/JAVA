package ModeloDeEncapsulamento.Apps;

public class SistemaDeMensagemSecond extends PadraoSistemaDeMensagem {

    @Override
    public void enviarMensagem() {
        validarconexao();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistorico();
    }

    private void salvarHistorico () {
        System.out.println("Fim da Conversa no Facebook");
        System.out.println("Salvando Histórico de conversas");
    }
}
