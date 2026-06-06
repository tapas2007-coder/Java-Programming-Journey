import java.util.Scanner;

public class DrivingPermit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Do you have a valid driving license? (true/false): ");
            boolean hasLicense = sc.nextBoolean();

            if (hasLicense) { //Nested if statement
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You are not eligible to drive. License required.");
            }
        } else {
            System.out.println("You are not eligible to drive. Minimum age is 18.");
        }

        sc.close();
    }
}
