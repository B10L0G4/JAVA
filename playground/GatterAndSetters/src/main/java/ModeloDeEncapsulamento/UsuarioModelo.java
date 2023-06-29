package ModeloDeEncapsulamento;

public class UsuarioModelo {


    public static void main(String[] args) {

        // Abrir Mensagem
        MessengerModel msn = new MessengerModel();

        // Enviar Mensagem
        msn.enviarMensagem();
        // Receber Mensagem
        msn.receberMensagem();
    }



}
