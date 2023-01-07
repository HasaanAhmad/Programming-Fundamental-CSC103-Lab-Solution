import java.util.InputMismatchException;
import java.util.Scanner;

public class GLT2 {
    public static void main(String[] args) {
        arrayIndex();
    }

    public static void arrayIndex() {
        int index;
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.println("Please enter Integer at index " + (i));
                    arr[i] = obj.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid Input");
                    obj.nextLine();
                }
            }
        }
        System.out.println("Please Enter the index to Print: ");
        while (true) {
            try {
                index = obj.nextInt();
                System.out.println("The element at " + index + " is " + arr[index]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid Integers");
                obj.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please enter Index within 0-9");
                obj.nextLine();
            }

        }
    }
}
