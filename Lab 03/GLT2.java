import java.util.Scanner;

public class GLT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int students = input.nextInt();
        System.out.println("Enter the number of Apples in Basket");
        int apples = input.nextInt();
        int AppleToEach = (students / apples);
        int RemainingApples = (students % apples);
        System.out.println("Each Student will get " + AppleToEach + " Apples.");
        System.out.println("Apples Remaining in basket are " + RemainingApples + ".");
    }
}
