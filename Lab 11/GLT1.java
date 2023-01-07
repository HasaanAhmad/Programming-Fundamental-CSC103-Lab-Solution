import java.util.Scanner;

/**
 * GLT1
 */
public class GLT1 {
    public static void main(String[] args) {
        sumOfTwo();
    }

    public static void sumOfTwo() {
        Scanner obj = new Scanner(System.in);
        int a, b;
        while (true) {

            try {
                System.out.println("Enter the first Integer Value: ");
                a = obj.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please Enter Valid Integer:");
                obj.nextLine();
            }
        }
        while (true) {
            System.out.println("Enter the Second Integer Value: ");

            try {
                b = obj.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please Enter Valid Integer:");
                obj.nextLine();
            }
        }
        System.out.println("The Sum of two numbers is : " + (a + b));
    }
}