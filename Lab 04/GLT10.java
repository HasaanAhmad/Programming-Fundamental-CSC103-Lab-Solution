import java.util.Scanner;

public class GLT10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Serendipity Booksellers Books Club");
        System.out.println("How many book have you purchased this month?");
        int noOfBook = input.nextInt();
        if (noOfBook == 0) {
            System.out.println("Your Earned Points are 0");
        } else if (noOfBook == 1) {
            System.out.println("Your Earned Points are 5");
        } else if (noOfBook == 2) {
            System.out.println("Your Earned Points are 15");
        } else if (noOfBook == 3) {
            System.out.println("Your Earned Points are 30");
        } else if (noOfBook >= 4) {
            System.out.println("Your Earned Points are 60");
        }
    }
}
