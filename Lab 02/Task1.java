// Name : Hasaan Ahmad
// Reg No. : SP22-BSE-017
// Instrutor Name : Sir Rizwan Rashid

// LAB TASK 1
// LAB ACTIVITY TO PRINT THE INFORMATION

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = myObj.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = myObj.nextInt();
        System.out.print("Enter third number: ");
        int num3 = myObj.nextInt();
        Avg(num1, num2, num3);
    }

    static void Avg(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println(average);
    }

}
