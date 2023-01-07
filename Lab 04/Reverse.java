import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num, reversed = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();
        System.out.println("Original Number: " + num);
        while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

}
