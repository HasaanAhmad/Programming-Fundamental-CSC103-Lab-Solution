import java.util.Scanner;

public class GLT1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the start of the limit: ");
        int start = myObj.nextInt();
        System.out.print("Enter the end of the limit: ");
        int end = myObj.nextInt();
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + "\t");
            }
        } else if (start > end) {
            for (int i = start; i >= end; i--) {
                System.out.print(i + "\t");
            }
        }

        System.out.println();
        System.out.print("Enter the number of integers: ");
        int integers = myObj.nextInt();
        System.out.print("Enter the integers: ");
        int number;
        int sum = 0;
        for (int i = 1; i <= integers; i++) {
            number = myObj.nextInt();
            double cube = Math.pow(number, 3);
            System.out.println("The cube of " + number + " is : " + cube);
            sum = sum + number;
        }
        System.out.println("The sum of these " + integers + " numbers is " + sum);
    }
}