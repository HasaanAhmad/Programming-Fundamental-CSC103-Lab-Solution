import java.util.HexFormat;
import java.util.Scanner;

public class GLT3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int Number = myObj.nextInt();
        String hex = Integer.toHexString(Number);
        System.out.println(hex.toUpperCase());

        System.out.print("Enter the  hex numeber: ");
        String hexInput = myObj.next();

    }
}
