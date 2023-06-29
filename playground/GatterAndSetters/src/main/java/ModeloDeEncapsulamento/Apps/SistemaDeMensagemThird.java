package ModeloDeEncapsulamento.Apps;

import java.util.logging.Logger;

public class SistemaDeMensagemThird extends PadraoSistemaDeMensagem {

    @Override
    public void enviarMensagem() {
        Logger log = Logger.getLogger("Instagran Logger");
        log.info(validarconexao() + " Loggers não visualizada pelo usuario");


    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Instagram");
        salvarHistorico();
   }



    private void salvarHistorico () {
        Logger log = Logger.getLogger("Instagran Logger");
        log.info("Salvando Histórico de conversas");
    }
}
