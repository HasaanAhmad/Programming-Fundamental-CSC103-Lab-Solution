import java.util.Scanner;

public class GLT9_d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // size of the square
        System.out.println("Enter the size of Triangle");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
