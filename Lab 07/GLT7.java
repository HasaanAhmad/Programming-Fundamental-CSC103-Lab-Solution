
/*
 * Name : Hasaan Ahmad
 * Roll No: SP22-BSE-017
 * Programming Fundamentals 
 * Lab 07
 */
import java.util.Scanner;

public class GLT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a Scanner

        // Prompt the user to enter n
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Display an n-by-n matrix
        printMatrix(n);
    }

    /** Method printMatrix displays an n-by-n matrix */
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                // Generate and print randomly 0 or 1
                System.out.print((int) (Math.random() * 2));
            }
            // Print newline
            System.out.println();
        }
    }
}
