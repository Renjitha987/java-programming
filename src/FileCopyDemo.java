import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("source.txt");
            FileWriter writer = new FileWriter("destination.txt");

            int data;

            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
