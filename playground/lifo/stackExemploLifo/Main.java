package stackExemploLifo;

public class Main {
    public static void main(String[] args) {
        pilha minhaPilha = new pilha(); // Instancia a pilha
        minhaPilha.push(new noDapilha(1)); // Adiciona um novo nó, este será o último  item da pilha
        minhaPilha.push(new noDapilha(2));
        minhaPilha.push(new noDapilha(3));
        minhaPilha.push(new noDapilha(4));
        minhaPilha.push(new noDapilha(5));
        minhaPilha.push(new noDapilha(6));
        minhaPilha.push(new noDapilha(7)); // Adiciona um novo nó, este será o primeiro item da pilha

        System.out.println(minhaPilha);

        //minhaPilha.pop(); // Remove o primeiro item da pilha
        // noDapilha pops = minhaPilha.pop();

        System.out.println("Poped: " + minhaPilha.pop().getData());
        // imprime o item removido, pops é o item removido, .getData() é o valor do item removido
        System.out.println(minhaPilha);

        minhaPilha.push(new noDapilha(666));
        System.out.println(minhaPilha);



    }
}
