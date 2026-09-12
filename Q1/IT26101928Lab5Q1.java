import java.util.Scanner;

public class IT26101928Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Display entered numbers
        System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);

        // Find smallest and largest
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display results
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}