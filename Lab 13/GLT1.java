import java.io.*;
import java.util.Scanner;

public class GLT1 {
    public static void main(String[] args) throws IOException {
        fileHandler();
    }

    public static void fileHandler() throws IOException {

        Scanner myObj = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("test.txt");
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter Number: ");
                int input = myObj.nextInt();

                fw.write(input + "\n");
                // close the file
            }
            fw.close();
            System.out.println("Files Saved");
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }
}
