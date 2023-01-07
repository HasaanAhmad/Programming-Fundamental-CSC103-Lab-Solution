import java.util.Scanner;

public class GLT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("Enter the number: ");
        int number = input.nextInt();// It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
