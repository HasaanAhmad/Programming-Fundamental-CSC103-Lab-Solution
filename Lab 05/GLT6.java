import java.util.Scanner;

public class GLT6 {
    static final int CONDITION = 0;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int number;
        int max = 0;
        int index = 0;
        number = myObj.nextInt();
        while (number != CONDITION) {
            number = myObj.nextInt();
            index++;
            if (number > max) {
                max = number;
            }
        }
        System.out.print("The largest number is " + max + " and index is " + (index - 1));
    }
}
