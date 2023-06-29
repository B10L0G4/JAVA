package ModeloDeEncapsulamento;


public class MessengerModel {
    public void enviarMensagem(){
        validarconexao();
        System.out.println("Enviando Mensagem ...");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem ...");
        salvarHistorico();
    }
    private void validarconexao () {
        System.out.println("Validando Conexão com a internet ...");
    }
    private void salvarHistorico () {
        System.out.println("Salvando Histórico de conversas");
    }



}
