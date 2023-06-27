package ListaDeAlunos;

public class ListaAlunos {

    public static void main(String[] args) {
        Aluno Van = new Aluno();

        Van.setNome("Vanessa");
        Van.setIdade(20);

        System.out.println("A aluna " + Van.getNome() + " tem " + Van.getIdade() + " anos");
    }
}

// get é responsavél por pegar o valor de uma variavel e deve ser usado em conjunto com o set e deve ser public
// set é responsavél por setar o valor de uma variavel e deve ser usado em conjunto com o get e deve ser public