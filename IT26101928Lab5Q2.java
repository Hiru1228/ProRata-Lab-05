import java.util.Scanner;

public class IT26101928Lab5Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int members = sc.nextInt();

        if (members < 0) {
            System.out.println("Invalid number! Must be greater than or equal to 0.");
        } else {
            switch (members) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Prize is a : Pen");
                    break;
                case 2:
                    System.out.println("Prize is a : Umbrella");
                    break;
                case 3:
                    System.out.println("Prize is a : Bag");
                    break;
                case 4:
                    System.out.println("Prize is a : Travelling Chair");
                    break;
                default:
                    System.out.println("Prize is a : Headphone");
                    break;
            }
        }

        sc.close();
    }
}