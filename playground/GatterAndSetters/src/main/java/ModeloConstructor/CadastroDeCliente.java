package ModeloConstructor;

public class CadastroDeCliente {
    public static void main(String[] args) {
        ModeloDeCadastro cadastro = new ModeloDeCadastro("Vanessa", 123456789.0, "Rua das borboletas, 0");
        // os parametros no construtor são os mesmos que foram definidos na classe ModeloDeCadastro
        //devem ser passados na mesma ordem e tipo , além de serem separados por virgula.
        cadastro.setNome("Ane");
        cadastro.setCpf(122456789.0);
        cadastro.setEndereco("Rua dos bobos, 0");

        System.out.println(cadastro.getNome() + "CPF:  " + cadastro.getCpf() + " Endereço: " + cadastro.getEndereco());

        // quando usar um construtor?
        // quando você quer que o objeto seja criado com os parametros
        // posso criar construtores sem parametros, com fields e com todos os parametros
        // boas práticas dizem que devemos criar um construtor sem parametros e um com todos os parametros
    }
}
