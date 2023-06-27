package ModeloDeEnuns;

public class SistemaDeEstados {
    public static void main(String[] args) {
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println(estado.getSigla() +" - "+ estado.getNome());
        }
        EstadosBrasileiros e = EstadosBrasileiros.MINAS_GERAIS;
        System.out.println(e.getNome());
        System.out.println(e.getSigla());
        System.out.println(e.getNomeMaiusculo());
    }

    // Enuns são usados para criar constantes que não podem ser alteradas
    // Enuns dicas de uso:
    // 1 - quando você tem um conjunto de constantes que são relacionadas entre si
    // 2 - quando você precisa de um conjunto de constantes que representam um estado
    // 3 - quando você precisa de um conjunto de constantes que representam opções
}
