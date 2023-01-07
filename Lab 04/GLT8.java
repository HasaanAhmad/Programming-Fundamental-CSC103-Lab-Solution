import java.util.Scanner;

public class GLT8 {
    public static void main(String[] args) {
        int day, mon, year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Day in (Numeric Form)");
        day = input.nextInt();
        System.out.println("Enter the month in numeric Form");
        mon = input.nextInt();
        System.out.println("Enter the last 2 numbers of year");
        year = input.nextInt();
        boolean isMagicNumber = ((day * mon) == year);
        if (isMagicNumber) {
            System.out.println("The Date is Magic");
        } else {
            System.out.println("The date is not magic");
        }
    }
}
