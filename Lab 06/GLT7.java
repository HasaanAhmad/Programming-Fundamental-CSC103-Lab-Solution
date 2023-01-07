import java.util.Scanner;

class GLT7 {

    // Function to print first and last
    // character of a string
    public static void firstAndLastCharacter(String str) {
        System.out.println("Enter the word");
        // Finding string length
        int n = str.length();

        // First character of a string
        char first = str.charAt(0);

        // Last character of a string
        char last = str.charAt(n - 1);

        // Printing first and last
        // character of a string
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    // Driver Code
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Given string str
        String str = input.next();

        // Function Call
        firstAndLastCharacter(str);
    }
}