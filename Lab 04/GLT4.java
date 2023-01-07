import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class GLT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter the first number: ");
        x = input.nextInt();
        System.out.print("Enter the second Number: ");
        y = input.nextInt();
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (y < x) {
            System.out.println(y + " is smaller than " + x);
        } else {
            System.out.println("Both Numbers are same");
        }
        System.out.println("Determine the sign");
        System.out.println("Enter a number");
        int signCheck = input.nextInt();
        if (signCheck > 1) {
            System.out.println("The Number is positive (+)");
        } else if (signCheck < 1) {
            System.out.println("The Number is negative (-)");
        } else if (signCheck == 0) {
            System.out.println("The Number is zero (0)");
        }
        System.out.println("Determine Minumum Of Three");
        System.out.println("Enter three numbers");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

    }
}
