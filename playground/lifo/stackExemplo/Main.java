package stackExemplo;

public class Main {
    public static void main(String[] args) {
        pilha minhaPilha = new pilha();
        minhaPilha.push(new noDapilha(1));
        minhaPilha.push(new noDapilha(2));
        minhaPilha.push(new noDapilha(3));
        minhaPilha.push(new noDapilha(4));
        minhaPilha.push(new noDapilha(5));
        minhaPilha.push(new noDapilha(6));
        minhaPilha.push(new noDapilha(7));

        System.out.println(minhaPilha);
    }
}
