import java.util.Scanner;

public class GLT1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a decimal number upto two decimal places.");
		double userInput = myObj.nextDouble();

		double Cents = userInput * 100;

		double Dollars = Cents / 100;

		double remainingCents = Cents % 100;

		double quaters = remainingCents / 25;
		remainingCents = remainingCents % 25;

		double dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;

		double nickles = remainingCents / 5;
		remainingCents = remainingCents % 5;

		double pennies = remainingCents;

		System.out.println("Amount has " + (int) Cents + " cents " + (int) Dollars + " Dollars " + (int) quaters
				+ " Quaters " + (int) dimes + " Dimes " + (int) nickles + " Nickels " + (int) pennies + " Pennies ");

	}
}
