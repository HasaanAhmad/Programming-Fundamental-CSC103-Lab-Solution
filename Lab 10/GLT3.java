import java.util.Arrays;
import java.util.Scanner;

public class GLT3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[][] array1 = new int[3][4];
        int[][] array2 = new int[4][3];
        System.out.println("Enter the Elements of First Array");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter the elements of row" + (i + 1));
            for (int j = 0; j < 4; j++) {
                array1[i][j] = myObj.nextInt();
            }
        }
        System.out.println("Enter the Elements of 2nd array");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter the elements of " + (i + 1));
            for (int j = 0; j < 3; j++) {
                array2[i][j] = myObj.nextInt();
            }
        }
        print2D(matProduct(array1, array2));
    }

    public static int[][] matProduct(int[][] mat1, int[][] mat2) {
        int[][] product = new int[mat1.length][mat2[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    product[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return product;
    }

    public static void print2D(int mat[][]) {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }
}
