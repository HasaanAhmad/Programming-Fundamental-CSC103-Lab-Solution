import java.util.Scanner;

public class GLT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students in 1st Class");
        double StudentsIn1 = input.nextInt();
        System.out.println("Enter the number of Students in 2nd Class");
        double StudentsIn2 = input.nextInt();
        System.out.println("Enter the number of Students in 3rd Class");
        double StudentsIn3 = input.nextInt();
        double ReqDesksIn1 = Math.ceil(StudentsIn1 / 2);
        double ReqDesksIn2 = Math.ceil(StudentsIn2 / 2);
        double ReqDesksIn3 = Math.ceil(StudentsIn3 / 2);
        int totalDesks = (int) (ReqDesksIn1 + ReqDesksIn2 + ReqDesksIn3);
        System.out.println("Desks required in classes are " + totalDesks);
    }
}
