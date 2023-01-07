
// Name : Hasaan Ahmad
// Reg No. : SP22-BSE-017
// Instrutor Name : Sir Rizwan Rashid
// LAB TASK 2
// LAB ACTIVITY TO ARRANGE
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int width;
        int length;
        int area;
        int perimeter;
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.println();
        System.out.print("Enter the width: ");
        width = console.nextInt();
        area = length * width;
        System.out.println("Area = " + area);
        System.out.println();
        perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
    }
}
