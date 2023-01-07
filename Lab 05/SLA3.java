import java.util.Scanner;

public class SLA3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int SENTINEL = -999;
        int number; // variable to store the number
        int sum = 0; // variable to store the sum
        int count = 0; // variable to store the total
        System.out.println("Enter positive integers " + "ending with " + SENTINEL);
        number = input.nextInt();
        while (number != SENTINEL) {
            sum = sum + number;
            count++;
            number = input.nextInt();
        }
        System.out.printf("The sum of %d " + "numbers = %d%n",
                count, sum);
        if (count != 0)
            System.out.printf("The average = %d%n", (sum / count));
        else
            System.out.println("No input.");
    }
}
