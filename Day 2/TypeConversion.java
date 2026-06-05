public class TypeConversion {
    public static void main(String[] args) {

        // Widening (int → double)
        int a = 50;
        double b = a;

        System.out.println("Widening Conversion:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Narrowing (double → int)
        double x = 9.78;
        int y = (int) x;

        System.out.println("\nNarrowing Conversion:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);
    }
}
