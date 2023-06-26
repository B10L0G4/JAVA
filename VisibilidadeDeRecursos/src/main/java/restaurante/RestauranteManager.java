package restaurante;

import restaurante.area.cliente.Cliente;
import restaurante.atendimento.Atendente;
import restaurante.atendimento.cozinha.Almoxarifado;
import restaurante.atendimento.cozinha.Cozinheiro;

public class RestauranteManager {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.fazerPedido();
        cliente.escolherLanche();
        cliente.pagarConta();

        Atendente atendente = new Atendente();
        atendente.servirMesa();
        atendente.receberPagamento();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.preparaLanche();
        cozinheiro.adicionarLancheBalcao();
        cozinheiro.entregarLanche();








    }
}
