import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VulnerableFileAccess {
    public static void main(String[] args) {
        String userInput = "../etc/passwd"; // Assume this comes from user input
        
        // Vulnerable file read operation
        readFile(userInput);
    }

    public static void readFile(String filename) {
        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
