package ModeloConstructor;

public class ModeloDeCadastro {
    private String nome;
    private Double cpf;
    private String endereco;

    public ModeloDeCadastro(String nome, Double cpf, String endereco) {
        // O construtor é responsavél por criar um objeto com os parametros passados
        // O construtor deve ter o mesmo nome da classe e não deve ter retorno
        // o this é responsavél por referenciar a variavel da classe, ou seja é um atributo da
        // classe , diferentemente do parametro que é uma variavel local
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
