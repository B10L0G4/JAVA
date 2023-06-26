package restaurante.atendimento.cozinha;

public class Almoxarifado {
    private static void controleEntrada(){
        System.out.println("Entrada de ingredientes ");
    }
    private static void controleSaida(){

        System.out.println("saida de ingredientes");
    }
    // métodos default é o modificador de acesso padrão e não precisa ser declarado
    static void entregarIngrediente(){
        System.out.println("entrega de ingrediente");
        controleSaida();
    }
    void trocarGas(){
        System.out.println("trocar gas");
    }
}


