import java.util.Scanner;

public class ServiceInvoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int storedAccountNumber = 12345;
        String statusCode = "valid";

        int accountNumber;
        double amountOfSale;

        System.out.print("Masukkan account number: ");
        accountNumber = input.nextInt();

        if (accountNumber == storedAccountNumber && statusCode.equals("valid")) {

            System.out.print("Masukkan amount of sale: ");
            amountOfSale = input.nextDouble();

            System.out.println("=== INVOICE ===");
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Amount of Sale : $" + amountOfSale);

        } else {
            System.out.println("Error: Account number tidak ditemukan atau status tidak valid.");
        }

        input.close();
    }
}