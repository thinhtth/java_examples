import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {
    public static void write(String filePath, String content) {

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.append(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }
    }
    public static String read(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("Successfully read from the file.");
            return content;
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
            return "";
        }
    }
}
