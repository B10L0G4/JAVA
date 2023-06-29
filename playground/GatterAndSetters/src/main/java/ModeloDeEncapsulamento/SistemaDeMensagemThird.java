package ModeloDeEncapsulamento;

import java.util.logging.Logger;

public class SistemaDeMensagemThird extends SistemaDeMensagemFirst {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Instagram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Instagram");
        salvarHistorico();
   }



    private void salvarHistorico () {
        Logger log = Logger.getLogger("SistemaDeMensagemThird");
        log.info("Salvando Histórico de conversas");
    }
}
