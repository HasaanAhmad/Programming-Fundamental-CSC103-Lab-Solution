
// Name : Hasaan Ahmad
// Reg No. : SP22-BSE-017
// Instrutor Name : Sir Rizwan Rashid


// LAB TASK 3
// LAB ACTIVITY TO MAKE A PROGRAM TO CALCULATE THE WAGES
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // THE DECLARATION
        int SECRET = 11;
        double 	RATE = 12.50;
        int num1, num2, newNum;
        String Name;
        double hourWorked, wages;


        // TAKING INPUTS
        System.out.println("Enter the Numbers");
        num1 = console.nextInt();
        num2 = console.nextInt();
        System.out.println("The Value of First Number is " + num1 + " The Value of second number is " + num2);
        newNum = (num1 * 2) + num2;
        newNum += SECRET;
        System.out.println("The Resultant Integer is " + newNum);
        System.out.println("Enter the Last Name: ");
        Name = console.next();
        System.out.println("Enter a Hours worked from 0 to 70 (In Decimals)");
        hourWorked = console.nextDouble();
        wages = hourWorked * RATE;


        // THE OUTPUT
        System.out.println("Name: " + Name);
        System.out.println("PayRate: " + RATE);
        System.out.println("Hours Worked: " + hourWorked);
        System.out.println("Salary: $" + wages);

    }
}
