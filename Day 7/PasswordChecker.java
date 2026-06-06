import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter Password: ");
            password = sc.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Login Successful!");

        sc.close();
    }
}
