import java.util.Scanner;

public class GLT2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = myObj.next();
        char alpha = alphabet.charAt(0);
        int Number = (int) alpha;
        System.out.println("The ascii number corresponding to " + alpha + " is " + Number);
    }
}
