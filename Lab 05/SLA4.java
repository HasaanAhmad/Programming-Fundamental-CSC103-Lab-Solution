import java.io.InputStream;
import java.util.Scanner;

public class SLA4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // declare the variables
        int num; // variable to store the random number
        int guess; // variable to store the number
        // guessed by the user
        boolean done; // boolean variable to control the loop
        num = (int) (Math.random() * 100);
        done = false;
        while (!done) {
            System.out.print("Enter an integer greater" + "than or equal to 0 and " + "less than 100: ");
            guess = input.nextInt();
            System.out.println();
            if (guess == num) {
                System.out.println("You guessed the " + "correct number.");
                done = true;
            } // Line 12
            else if (guess < num)
                System.out.println("Your guess is " + "lower than"
                        + "the number.\n" + "Guess again!");
            else // Line 15
                System.out.println("Your guess is " + "higher than"
                        + "the number.\n" + "Guess again!");
        } // end while
    }
}
