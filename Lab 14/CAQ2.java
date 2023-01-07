
/**
 * CAQ2
 */
import java.util.Scanner;

public class CAQ2 {

    // function that checks if the given number is perfect or not
    static boolean isPerfect(int n) {
        // 1 is not a perfect number
        if (n == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // Init with sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }

        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(4));
        System.out.println(isPerfect(3));
        System.out.println(isPerfect(6));
    }
}