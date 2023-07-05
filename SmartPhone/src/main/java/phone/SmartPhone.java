package phone;

import apps.Navigator;
import apps.Reproducer;
import apps.Phone;



public class SmartPhone implements Navigator, Reproducer, Phone {



    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");


    }

    @Override
    public void ligar() {
        System.out.println("Ligando");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo");


    }

    @Override
    public void voiceMail() {
        System.out.println("Enviado para VoiceMail");


    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando");


    }

    @Override
    public void pausar() {
        System.out.println("Pausando");

    }
}
