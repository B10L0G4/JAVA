package restaurante.atendimento.cozinha;

public class Cozinheiro {
    public void preparaLanche() {

        System.out.println("prepara lanche");
    }
    private void adicionaIngrediente() {

        System.out.println("adiciona ingrediente");
    }

    private void lavarIngredientes() {
        System.out.println("lavar ingredientes");
    }
    private void cortarIngredientes() {
        System.out.println("cortar ingredientes");
    }
    private void baterVitaminas() {
        System.out.println("Preparando Vitaminas");
    }
    private void prepararLanche() {
        System.out.println("preparando lanche");
    }
    public void adicionarLancheBalcao() {
        System.out.println("adicionando lanche ao balcão");
    }
    public void entregarLanche() {
        System.out.println("entregando lanche");
    }


    private static void pedirIngrediente(Almoxarifado almoxarifado) {
        almoxarifado.entregarIngrediente();





    }
}
