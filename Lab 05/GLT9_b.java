import java.util.Scanner;

public class GLT9_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // size of the square
        System.out.println("Enter the size of Triangle");
        int size = input.nextInt();
        // loop to print the pattern
        for (int i = 0; i < size; i++) {
            // print column
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
