import java.util.Scanner;


public class GLT9 {
    public static void main(String[] args) {
        int pen, nic, dim, quat;
        Scanner input = new Scanner(System.in);
        System.out.println("Ente the number of pennies");
        pen = input.nextInt();
        System.out.println("Ente the number of Nickles");
        nic = input.nextInt();
        System.out.println("Ente the number of Dimes");
        dim = input.nextInt();
        System.out.println("Ente the number of Quaters");
        quat = input.nextInt();
        double totalWorth = (pen * 1) + (nic * 5) + (dim * 10) + (quat * 25);
        if (totalWorth == 100) {
            System.out.println("The Given amount is equal to 1 Dollar");
        }

        else if (totalWorth < 100) {
            System.out.println("The Given amount is less to 1 Dollar");
        } else if (totalWorth > 100) {
            System.out.println("The Given amount is more to 1 Dollar");
        }
    }
}
