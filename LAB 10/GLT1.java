import java.util.Arrays;
import java.util.Scanner;

public class GLT1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[][] array = new int[3][4];
        System.out.println("Enter the Elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Elements of Row " + (i + 1));
            for (int j = 0; j < 4; j++) {
                array[i][j] = myObj.nextInt();
            }
        }
        System.out.println("The Matrix is: ");
        print2D(array);

        calSum(array);
    }

    public static void print2D(int mat[][]) {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    public static void calSum(int[][] mat) {
        int rowSum = 0, maxRowSum = -1, maxRowIndex = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSum = rowSum + mat[i][j];
            }
            if (maxRowSum < rowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
            rowSum = 0; // resetting before next iteration
        }

        // Column calculation
        int colSum = 0, maxColSum = -1, maxColIndex = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                colSum = colSum + mat[j][i];
            }
            if (maxColSum < colSum) {
                maxColSum = colSum;
                maxColIndex = i;
            }
            colSum = 0; // resetting before next iteration
        }

        System.out.println("Row " + maxRowIndex + " has highest sum = " + maxRowSum);
        System.out.println("Col " + maxColIndex + " has highest sum = " + maxColSum);

    }

}