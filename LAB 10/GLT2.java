import java.util.*;

public class GLT2 {
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static int[] primeRow(int[][] row) {
        int count = 0;
        int[] arr = new int[3];
        int div = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (isPrime(row[i][j]) == true) {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }

        return arr;
    }

    public static int[] primeCol(int[][] col) {
        int count = 0;
        int[] arr = new int[4];
        int div = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                if (isPrime(col[i][j]) == true) {
                    count++;
                }
            }
            arr[j] = count;
            count = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE MATRIX 3x4 ");
        int[][] array = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int count = 0;
        int c1 = 0;
        int[] roe = primeRow(array);
        for (int i = 0; i < roe.length; i++) {
            if (roe[i] > count) {
                count = roe[i];
                c1 = i;
            }
        }
        print2D(array);
        System.out.println("the row which has greater number of prime is " + (c1 + 1));
        int count1 = 0;
        int c = 0;
        int[] col = primeCol(array);
        for (int i = 0; i < col.length; i++) {
            if (col[i] > count1) {
                count1 = col[i];
                c = i;
            }
        }
        System.out.println("the col which has greater number of prime is " + (c + 1));
    }

    public static void print2D(int mat[][]) {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }
}