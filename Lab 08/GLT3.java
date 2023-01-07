import java.util.Scanner;

public class GLT3 {

    static void printArray(int arr[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the length of Array: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the Element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int copied_arr[] = new int[len], i;

        for (i = 0; i < len; i++) {
            copied_arr[i] = arr[len - i - 1];
        }

        System.out.printf("\nOriginal array: ");
        printArray(arr, len);

        System.out.printf("\nResultant array: ");
        printArray(copied_arr, len);
    }
}