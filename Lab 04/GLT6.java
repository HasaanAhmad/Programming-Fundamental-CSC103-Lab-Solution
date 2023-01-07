import java.util.Scanner;

public class GLT6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Roman Converter");
        System.out.println("Enter a Number Between 1 to 10");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number " + num + " in Roman is \"I\" ");
                break;
            case 2:
                System.out.println("Number " + num + " in Roman is \"II\" ");
                break;
            case 3:
                System.out.println("Number " + num + " in Roman is \"III\" ");
                break;
            case 4:
                System.out.println("Number " + num + " in Roman is \"IV\" ");
                break;
            case 5:
                System.out.println("Number " + num + " in Roman is \"V\" ");
                break;
            case 6:
                System.out.println("Number " + num + " in Roman is \"VI\" ");
                break;
            case 7:
                System.out.println("Number " + num + " in Roman is \"VII\" ");
                break;
            case 8:
                System.out.println("Number " + num + " in Roman is \"VIII\" ");
                break;
            case 9:
                System.out.println("Number " + num + " in Roman is \"IX\" ");
                break;
            case 10:
                System.out.println("Number " + num + " in Roman is \"X\" ");
                break;

            default:
                System.out.println("Please Enter Number from Range 1 to 10");
                break;
        }
    }
}
