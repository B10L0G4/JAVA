// 2- Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class informerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // system.in faz a leitura do teclado
        System.out.println("Digite um número:");
        int number = scanner.nextInt(); // nextInt() faz a leitura do número inteiro

        System.out.println("O número informado foi:" + number);
    }
}
