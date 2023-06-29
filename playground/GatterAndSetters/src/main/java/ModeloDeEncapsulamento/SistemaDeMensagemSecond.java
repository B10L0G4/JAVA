package ModeloDeEncapsulamento;

public class SistemaDeMensagemSecond extends SistemaDeMensagemFirst {

    @Override
    public void enviarMensagem() {
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
