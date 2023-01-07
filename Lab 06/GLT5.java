import java.util.Scanner;

class GLT5 {
    public static boolean isPalindrome(String str) {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
            System.out.println("The Given String is Palindrome");
        } else {
            System.out.println("The Given String is not Palindrome");

        }
        return ans;
    }

    public static void main(String[] args) {
        // Input string
        System.out.println("Enter the Word");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}