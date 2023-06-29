package ModeloDeEncapsulamento.Apps;


import ModeloDeEncapsulamento.Apps.PadraoSistemaDeMensagem;

public class SistemaDeMensagemFirst extends PadraoSistemaDeMensagem {

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


    private void salvarHistorico () {
        System.out.println("Salvando Histórico de conversas");
    }

}
