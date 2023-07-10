package generics;

public class Generics {
    List<String> list = new List<>();// o tipo de dado é definido na instanciação

    public class List<T> {
        private T t;
    }

    // unbounded wildcard
    // upper bounded wildcard


    // ----------------------------------------//
//    public void imprimirLista(List<?> lista) {
//        for (Object o : lista) {
//            System.out.println(o);
//        }
//    } // funciona com qualquer tipo de dado
//
//    List<Aluno> minhaLista = new List<>();
//    minhaLista.add(new
//
//    Aluno("João"));


// upperbounded wildcard

//    public void imprimirLista(List<? extends Aluno> listaAlunos) {
//        for (Aluno a : listaAlunos) {
//            System.out.println(a);
//        }
//    } // funciona com classes que herdam de Aluno

// lowerbounded wildcard

//    public void imprimirLista(List<? super Aluno> listaAlunos) {
//        for (Object o : listaAlunos) {
//            System.out.println(o);
//        }
//    } // funciona com classes que são superclasses de Aluno


}

// K - key (chave) exemplo: Map<K,V>
// V - value (valor) exemplo: Map<K,V>
// E - element (elemento) exemplo: List<E>
// N - number (número) exemplo: List<N>
// T - type (tipo) exemplo: List<T>
// S,U,V etc - usado para representar outros tipos
// R - return (retorno) exemplo: Function<T,R>
// ? - wildcard (curinga) exemplo: List<?>


// generics são classes que podem trabalhar com diversos tipos de dados
// o T é um tipo genérico, que pode ser substituído por qualquer tipo de dado
// e é usado para criar classes, interfaces e métodos genéricos
// Contexto - Evitar casting excessivo (conversão de tipos)
// evitar codigos duplicados (redubndancia de código)
// Encontrar erros em tempo de compilação
// um conceito importante é o tipo de dado curinga ou wildcard (unbounded wildcard - são
// representados pelo sinal de interrogação ?)
// o tipo de dado curinga é usado para representar um tipo desconhecido
// Bounde wildcard -