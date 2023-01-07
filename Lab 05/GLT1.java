import java.util.Scanner;

public class GLT1 {
    public static void main(String[] args) {
        int count, num, num1, num2, sum, CubeSum;
        System.out.println("Enter the lower limit");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        System.out.println("Enter the Upper Limit:");
        num2 = input.nextInt();
        System.out.println("The Numbers are");
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }
        System.out.println("Sum of the cubes of N integers");
        System.out.println("Enter the number");
        int cube = input.nextInt();
        int cubeCount = 1;
        CubeSum = 0;
        while (cubeCount <= cube) {
            CubeSum += cubeCount;
            cubeCount++;
        }
        System.out.println(Math.pow(CubeSum, 3));

    }
}
