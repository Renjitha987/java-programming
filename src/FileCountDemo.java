import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCountDemo {
    public static void main(String[] args) {

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("sample.txt")
            );

            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordList = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += wordList.length;
                }
            }

            reader.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
