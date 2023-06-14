import java.util.Scanner;

public class CintaTerminal {
    public static void main(String[] args) {

        int number;
        String agency;
        String clientName;
        float amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the account: ");
        number = scanner.nextInt();

        System.out.println("Enter the number of the agency: ");
        agency = scanner.next();

        System.out.println("Enter the name of the client: ");
        clientName = scanner.next();

        System.out.println("Enter the amount of the account: ");
        amount = scanner.nextFloat();

        System.out.println("Hello "+ clientName + " ,Thanks for create account with us, your agency is: "+ agency + " and your account is: " + number);
        System.out.println("Your current balance is: " + amount + " and you can use it in our services");







    }
}
