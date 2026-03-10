import java.util.Scanner;

public class ServiceKomputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerAmount;
        int peripheral;
        double baseFee = 0;
        double additionalFee = 0;
        double totalBaseFee;
        boolean businessHours;
        boolean dropOffPickup;

        System.out.print("Jumlah komputer: ");
        computerAmount = input.nextInt();

        System.out.print("Jumlah peripheral: ");
        peripheral = input.nextInt();

        System.out.print("Apakah servis pada jam kerja? (true/false): ");
        businessHours = input.nextBoolean();

        System.out.print("Apakah customer drop off dan pick up sendiri? (true/false): ");
        dropOffPickup = input.nextBoolean();

        // DO CASE
        if (computerAmount == 1 || computerAmount == 2) {
            baseFee = 50;
            additionalFee = 0;
        } 
        else if (computerAmount >= 3 && computerAmount <= 10) {
            baseFee = 100;
            additionalFee = 10 * peripheral;
        } 
        else if (computerAmount > 10) {
            baseFee = 500;
            additionalFee = 10 * peripheral;
        }

        // IF service-time is NOT in business hours
        if (!businessHours) {
            baseFee = baseFee * 2;
        }

        totalBaseFee = baseFee + additionalFee;

        // IF customer is willing to drop off and pick up
        if (dropOffPickup) {
            totalBaseFee = totalBaseFee / 2;
        }

        System.out.println("Total biaya servis: $" + totalBaseFee);

        input.close();
    }
}