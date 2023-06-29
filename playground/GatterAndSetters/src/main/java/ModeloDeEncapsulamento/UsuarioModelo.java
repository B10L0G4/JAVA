package ModeloDeEncapsulamento;

import ModeloDeEncapsulamento.Apps.SistemaDeMensagemFirst;
import ModeloDeEncapsulamento.Apps.SistemaDeMensagemSecond;
import ModeloDeEncapsulamento.Apps.SistemaDeMensagemThird;

import java.util.Scanner;

public class UsuarioModelo {


    public static void main(String[] args) {

        // Abrir Mensagem
        SistemaDeMensagemFirst msn = new SistemaDeMensagemFirst();
        SistemaDeMensagemSecond Facebook = new SistemaDeMensagemSecond();
        SistemaDeMensagemThird Instagram = new SistemaDeMensagemThird();

        // Usuario X testando sistemas de comunicações diferentes utilizando encapsulamento e herança

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sistema de mensagem você quer utilizar?  ");
        String servico = scanner.nextLine().toUpperCase();


        if (servico.equals("MSN")) {
            msn.enviarMensagem();
            msn.receberMensagem();
        } else if (servico.equals("FACEBOOK")) {
            Facebook.enviarMensagem();
            Facebook.receberMensagem();
        } else if (servico.equals("INSTAGRAN")) {
            Instagram.enviarMensagem();
            Instagram.receberMensagem();
        } else {
            System.out.println("Sistema de mensagem não encontrado");
        }





    }



}
