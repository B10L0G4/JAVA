package ListaDeAlunos;

public class ListaAlunos {

    public static void main(String[] args) {
        Aluno Van = new Aluno();

        Van.nome = "Vanessa";
        Van.idade = 20;

        System.out.println("A aluna" + Van.nome + "tem" + Van.idade + "anos");
    }
}
