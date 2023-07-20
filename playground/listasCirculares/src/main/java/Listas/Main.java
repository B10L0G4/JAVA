package Listas;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> no1 = new ListaCircular<>();


        no1.add("A");

        System.out.println(no1);

        no1.remove(0);
        System.out.println(no1);

        no1.add("B");
        no1.add("C");
        System.out.println(no1);

        System.out.println(no1.get(0));
        System.out.println(no1.get(1));
        System.out.println(no1.get(2));



    }
}
