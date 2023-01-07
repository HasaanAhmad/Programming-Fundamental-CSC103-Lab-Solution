import java.util.Scanner;
import java.util.Arrays;

public class GLT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elemnents: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        modify(arr);
    }

    static void modify(int[] arr) {
        int len = arr.length;
        System.out.println("This is modified ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }

        System.out.println(Arrays.toString(arr));
    }
}
