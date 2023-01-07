import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GLT2 {
    public static void main(String[] args) {
        Reader("test.txt");
    }

    public static void Reader(String path) {
        File obj = new File(path);
        try (Scanner read = new Scanner(obj)) {
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
