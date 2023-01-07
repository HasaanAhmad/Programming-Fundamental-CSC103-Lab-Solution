import java.util.Scanner;

public class GLT9_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // size of the square
        System.out.println("Enter the size of Square");
        int size = input.nextInt();
        // outer loop
        for (int i = 0; i < size; i++) {
            // inner loop
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}