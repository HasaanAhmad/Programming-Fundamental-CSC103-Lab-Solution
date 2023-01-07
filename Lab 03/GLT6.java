import java.util.Scanner;

public class GLT6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final double salaryHour = 15.0;

        System.out.print("Enter the number of hours you worked each week: ");
        int hoursWeek = in.nextInt();
        // System.out.println(hours);
        double salaryWeek = hoursWeek * salaryHour;

        System.out.println("salary before taxes: " + salaryWeek);
        salaryWeek -= salaryWeek * 0.14;
        System.out.println("salary after taxes: " + salaryWeek);

        double clothes = salaryWeek * 0.1;
        System.out.println("The money you spend on clothes and other accessories: " + clothes);

        double school = salaryWeek * 0.01;
        System.out.println("The money you spend on school supplies: " + school);

        double bond = salaryWeek * 0.25;
        System.out.println("The money you spend to buy savings bonds: " + bond);

        double bondParents = bond / 2;
        System.out.println("The money your parents added for your savings bonds: " + bondParents);

        salaryWeek -= clothes + school + bond + bondParents;
        System.out.println("The money left from your income for the week: " + salaryWeek);

    }
}
