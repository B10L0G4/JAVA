package ListaDeAlunos;

public class Aluno {
    private String nome; // private é responsavél por deixar a variavel privada e só pode ser acessada por metodos publicos
    private int idade;


    public String getNome(){
        // get é responsavél por pegar o valor de uma variavel e deve ser usado em conjunto com o set e deve ser public
        return nome;
    }
    public void setNome(String newNome){
        // set é responsavél por setar o valor de uma variavel e deve ser usado em conjunto com o get e deve ser public
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int newIdade){
        this.idade = newIdade; // this é responsavél por referenciar a variavel da classe
    }
}
