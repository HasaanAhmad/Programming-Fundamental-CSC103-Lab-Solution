import java.util.*;

public class GLT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[40];
        int sum = 0;
        System.out.println("enter the quality of food. on a scale of 1 to 10 (1 means awful and 10 means excellent).");
        for (int i = 0; i < 40; i++) {
            array[i] = input.nextInt();
        }
        for (int j = 0; j < 40; j++) {
            sum = sum + array[j];
        }

        int f = sum / array.length;

        switch (f) {
            case 1:
                System.out.println("Aswful");
                break;
            case 2:
                System.out.println("Extremely bad");
                break;
            case 3:
                System.out.println("Very bad");
                break;
            case 4:
                System.out.println("Bad");
                break;
            case 5:
                System.out.println("Normal");
                break;
            case 6:
                System.out.println("Eatable");
                break;
            case 7:
                System.out.println("Good");
                break;
            case 8:
                System.out.println("Very good");
                break;
            case 9:
                System.out.println("Delicious");
                break;
            case 10:
                System.out.println("Excellent");
                break;
        }
    }
}