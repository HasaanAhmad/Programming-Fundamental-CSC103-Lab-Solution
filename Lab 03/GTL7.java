import java.util.Scanner;

public class GTL7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ClassAPrice = 20;
        int ClassBPrice = 15;
        int ClassCPrice = 10;
        int ClassDPrice = 5;
        System.out.println("Enter the Seats Sold in Class A");
        int NoOfSeatsInA = input.nextInt();
        System.out.println("Enter the Seats Sold in Class B");
        int NoOfSeatsInB = input.nextInt();
        System.out.println("Enter the Seats Sold in Class C");
        int NoOfSeatsInC = input.nextInt();
        System.out.println("Enter the Seats Sold in Class D");
        int NoOfSeatsInD = input.nextInt();
        int totalIncome = (NoOfSeatsInA * ClassAPrice) + (NoOfSeatsInB * ClassBPrice) + (NoOfSeatsInC * ClassCPrice)
                + (NoOfSeatsInD * ClassDPrice);
        System.out.println("The total income generated from all the tickets is $" + totalIncome);
    }
}
