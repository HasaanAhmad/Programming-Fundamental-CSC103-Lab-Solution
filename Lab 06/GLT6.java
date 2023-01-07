import java.util.Scanner;

public class GLT6 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println("Strings before swapping: " + str1 + " " + str2);

        // Concatenate both the string str1 and str2 and store it in str1
        str1 = str1 + str2;
        // Extract str2 from updated str1
        str2 = str1.substring(0, (str1.length() - str2.length()));
        // Extract str1 from updated str1
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}
