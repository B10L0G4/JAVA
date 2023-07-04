import apps.Navigator;
import apps.Phone;
import apps.Reproducer;
import phone.SmartPhone;

import java.util.Scanner;


public class smartPhoneUsuario  {
    public static void main(String[] args) {
        SmartPhone app = new SmartPhone();

        Reproducer reproducer = app;
        Phone phone = app;
        Navigator navigator = app;

            app.abrirNovaAba();
            app.atualizarPagina();
            app.exibirPagina();

            app.selecionarMusica();
            app.tocar();
            app.pausar();

            app.ligar();
            app.atender();
            app.voiceMail();


    }

}
