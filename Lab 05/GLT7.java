import java.util.Scanner;

public class GLT7 {
    static final int CONDITION = 0;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int number;
        int count = 0;
        number = myObj.nextInt();
        while (number != CONDITION) {
            number = myObj.nextInt();
            if (number % 2 == 0) {
                count++;
            } else if (number == 0) {
                break;
            }
        }
        System.out.print("The number of even numbers in the sequence is " + (count - 1));
    }
}