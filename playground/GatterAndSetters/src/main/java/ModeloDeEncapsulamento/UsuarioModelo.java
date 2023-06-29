package ModeloDeEncapsulamento;

public class UsuarioModelo {


    public static void main(String[] args) {

        // Abrir Mensagem
        MessengerModel msn = new MessengerModel();
        SistemaDeMensagemSecond Facebook = new SistemaDeMensagemSecond();
        SistemaDeMensagemThird Instagram = new SistemaDeMensagemThird();

        // Usuario X testando sistemas de comunicações diferentes utilizando encapsulamento e herança
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook.enviarMensagem();
        Facebook.receberMensagem();

        Instagram.enviarMensagem();
        Instagram.receberMensagem();
    }



}
