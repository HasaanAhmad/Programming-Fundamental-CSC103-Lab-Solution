import java.util.Scanner;

public class GLT9_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // size of the square
        System.out.println("Enter the size of Triangle");
        int size = input.nextInt();
        // loop to print the pattern
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
