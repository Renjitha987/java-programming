import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionDemo {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File does not exist.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        System.out.println("Program completed.");
    }
}
