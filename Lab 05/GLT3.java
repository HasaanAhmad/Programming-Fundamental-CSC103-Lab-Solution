import java.util.Scanner;

public class GLT3 {
    public static void main(String[] args) {
        System.out.println("Enter the N of integers");
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int count = 0;
        int zeros = 0;
        while (count < limit) {
            System.out.println("Enter the number");
            int num = input.nextInt();
            if (num == 0) {
                zeros++;
            }
            count++;
        }
        System.out.println("The number of zeros are " + zeros);
    }
}
