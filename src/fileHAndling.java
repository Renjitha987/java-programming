import java.io.*;

public class fileHAndling {

    public static void main(String[] args) {

        try {

            // Writing data
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Name: Renjitha\n");
            fw.write("Mark: 85\n");

            fw.close();

            System.out.println("Data written successfully");

            // Reading data
            FileReader fr = new FileReader("student.txt");

            int ch;

            System.out.println("\nStudent Details:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }

        catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}