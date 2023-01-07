import java.util.Scanner;

public class GLT4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println("The Hours are " + hours);
        System.out.println("Remaining Munutes are " + remainingMinutes);
        System.out.println("The time is " + hours + ":" + remainingMinutes);
    }
}
