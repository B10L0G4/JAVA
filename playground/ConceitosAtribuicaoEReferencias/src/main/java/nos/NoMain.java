package nos;

public class NoMain {
    public static void main(String[] args) {

        encadeamentoDeNos no1 = new encadeamentoDeNos("Conteudo no1"); //criando o primeiro nó

        encadeamentoDeNos no2 = new encadeamentoDeNos("Conteudo no2");//criando o segundo nó
        no1.setProximoNo(no2); //apontando o primeiro nó para o segundo nó

        encadeamentoDeNos no3 = new encadeamentoDeNos("Conteudo no3");//criando o terceiro nó
        no2.setProximoNo(no3);//apontando o segundo nó para o terceiro nó

        encadeamentoDeNos no4 = new encadeamentoDeNos("Conteudo no4");//criando o quarto nó
        no3.setProximoNo(no4);//apontando o terceiro nó para o quarto nó

        System.out.println(no1); //imprimindo o primeiro nó
        System.out.println(no1.getProximoNo()); //imprimindo o segundo nó
        System.out.println(no1.getProximoNo().getProximoNo()); //imprimindo o terceiro nó
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); //imprimindo o quarto nó
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); //imprimindo o quinto nó que devera ser nulo

        // nós encadeados são usados para criar listas encadeadas, pilhas e filas
        //um nó é uma referencia de um caminho na memória do computador ,
        // cada nó aponta para o próximo nó
        // para entender os nós , temos que entender o conceito de referência,
        // que é um endereço de memória que aponta para outro endereço de memória
        // o primeiro nó é chamado de nó cabeça, e o último nó é chamado de nó cauda
        // o nó cauda aponta para null
        // pq o nó cauda aponta para null? pq ele é o último nó da lista



    }
}
