import java.util.Scanner;      
import java.net.URL;           
import java.io.BufferedReader; 
import java.io.InputStreamReader; 

public class URLReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a website URL (e.g., https://www.example.com): ");
        String urlString = scanner.nextLine();

        try {
            URL url = new URL(urlString); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            System.out.println("Fetching data from " + urlString + "...");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error fetching data from the URL.");
        }

        scanner.close();
    }
}
