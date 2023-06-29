package ModeloDeEncapsulamento.Apps;

public abstract class PadraoSistemaDeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected String validarconexao () {
        System.out.println("Validando Conexão com a internet ...");
        return "Conexão Validada";
    }
}
// classe abstrata não possui corpo de método, apenas a assinatura do método
