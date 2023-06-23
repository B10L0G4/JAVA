import java.util.Scanner;

// 3 - Faça um Programa que peça dois números e imprima a soma.
public class sun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int fisrtNumber = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int secondNumber = scanner.nextInt();

        System.out.println("A soma dos números é:" + sun(fisrtNumber, secondNumber));
    }

    private static int sun(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
