import java.util.Scanner;

public class salesTax {

    public static void main(String[] args) {
        final double taxRate = 0.055;
        double price;
        double tax;
        double total;
        String item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Item  Description:");
        item = sc.nextLine();
        System.out.println("Price: ");
        price = sc.nextDouble();
        tax = price * taxRate;
        total = tax + price;

        // Displaying Results
        System.out.println("Item Description: " + item);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

    }
}