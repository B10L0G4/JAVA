package listasDuplas;

public class Main {
    public static void main(String[] args) {
        ListaDuplamneteEncadeada<String> minhaListaEncadeada = new ListaDuplamneteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "99");

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(3));
    }
}
