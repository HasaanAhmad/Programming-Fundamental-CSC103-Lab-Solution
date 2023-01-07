import java.util.Scanner;

public class GLT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PROFITEACHCARTON = 0.27;
        final double COSTPERLITER = 0.38;
        final double CARTONSTORAGE = 3.78;
        System.out.println("Enter the Amount of milk Produced:");
        int milk = input.nextInt();
        int cartonsNeeded = (int) (milk / CARTONSTORAGE);
        int CostOfProduction = (int) (milk * COSTPERLITER);
        System.out.println("Cost of producing milk is $" + CostOfProduction);
        int totalProfit = (int) (cartonsNeeded * PROFITEACHCARTON);
        System.out.println("Total Profit is $" + totalProfit);
    }
}
