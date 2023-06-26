package restaurante.area.cliente;

public class Cliente {

    public void escolherLanche() {
        System.out.println("escolher lanche");
    }
    public void fazerPedido() {
        System.out.println("Fazer pedido");
    }
    public void pagarConta() {
        System.out.println("pagar conta");
        consultarSaldoDaConta();
    }
    private void consultarSaldoDaConta() {
        System.out.println("consultando saldo da conta");
    }
}
