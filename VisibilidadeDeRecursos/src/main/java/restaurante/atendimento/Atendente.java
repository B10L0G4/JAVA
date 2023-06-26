package restaurante.atendimento;

public class Atendente {
    void trocarGas (){
        System.out.println("Trocando o gas");
    }

    private void entregarLanches(){
        System.out.println("entregar lanches");
        receberLanche();
    }
    public void receberPagamento(){
        System.out.println("receber pagamento");
    }
    public void servirMesa(){
        System.out.println("servir mesa");
    }
    private void receberLanche(){
        System.out.println("receber lanche");
    }
}
