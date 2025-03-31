import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        System.out.println("Square Root: " + Math.sqrt(num));
        System.out.println("Absolute Value: " + Math.abs(num));
        System.out.println("Power (num^2): " + Math.pow(num, 2));

        scanner.close();
    }
}
