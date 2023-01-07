import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class GLT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter three Numbers");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if ((x == y && y == z)) {
            System.out.println("3 of the numbers are same");
        } else if ((x == y && y != z) || (x != y && y == z) || (x == z && x != y)) {
            System.out.println("2 of the numbers are same");
        } else {
            System.out.println("0 All the numbers are different");
        }
    }
}
