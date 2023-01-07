import java.util.Scanner;

public class GLT5 {
    static final int CONDITION = 0;

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int number;
        int max = 0;
        number = myObj.nextInt();
        while (number != CONDITION) {
            number = myObj.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.print("The largest number is " + max);
    }
}