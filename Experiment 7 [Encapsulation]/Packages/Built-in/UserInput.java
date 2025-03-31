import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        System.out.println("Student Name: " + name + ", Marks: " + marks);
        scanner.close();
    }
}
