import java.util.Scanner;

public class Main {

    static void sum(int arg1, int arg2) {
        System.out.println(arg1 + arg2);
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = myobj.nextLine();
        System.out.println("Enter your Age:");
        int age = myobj.nextInt();
        System.out.println(name + " is " + age + " years old.");
        sum(5, 8);
    }
}
