import java.util.Scanner;  
import java.io.FileWriter; 
import java.io.IOException; 

public class FileWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter some text to save to a file:");
        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Text written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file.");
        }
        
        scanner.close();
    }
}
