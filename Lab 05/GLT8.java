import java.util.Scanner;

public class GLT8 {
    static final int CONDITION = 0;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int number;
        int count = 0;
        int max = 0;
        number = myObj.nextInt();
        while (number != CONDITION) {
            number = myObj.nextInt();
            if (number > max) {
                count++;
                max = number;
            }
        }
        System.out.print("The number of digits which are greater than previous are:  " + (count));
    }
}