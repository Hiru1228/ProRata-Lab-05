import java.util.Scanner;

public class IT26101928Lab5Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = sc.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31) {
            System.out.println("Invalid Start Date! Must be between 1 and 31.");
        }

        // Validation 2
        else if (startDate >= endDate) {
            System.out.println("Invalid End Date! End date should be after start date.");
        }

        else {
            int days = endDate - startDate;

            double discountRate;

            if (days < 3) {
                discountRate = 0;
            }
            else if (days <= 4) {
                discountRate = 10;
            }
            else {
                discountRate = 20;
            }

            double roomCharge = days * ROOM_CHARGE;
            double discount = roomCharge * discountRate / 100;
            double totalAmount = roomCharge - discount;

            System.out.println();
            System.out.println("Room Charge Per Day: " + ROOM_CHARGE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Discount Rate: " + discountRate + "%");
            System.out.println("Discount Amount: " + discount);
            System.out.println("Total Amount: " + totalAmount);
        }

        sc.close();
    }
}