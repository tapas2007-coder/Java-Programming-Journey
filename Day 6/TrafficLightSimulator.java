import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (Red, Yellow, Green): ");
        String color = sc.nextLine();

        switch (color.toLowerCase()) {

            case "red":
                System.out.println("STOP");
                break;

            case "yellow":
                System.out.println("READY");
                break;

            case "green":
                System.out.println("GO");
                break;

            default:
                System.out.println("Invalid Traffic Light Color");
        }

        sc.close();
    }
}
