import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Java implementation of the approach
class GLT3 {
    static int sz = (int) 1e5;
    static boolean[] isPrime = new boolean[sz + 1];

    // Function for Sieve of Eratosthenes
    static void sieve() {
        for (int i = 0; i < sz + 1; i++)
            isPrime[i] = true;

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= sz; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < sz; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    // Function to print the elements of the array
    static void printArray(int arr[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\n");
        }
    }

    // Function to remove all the prime numbers
    static void removePrimes(int arr[], int len) {
        // Generate primes
        sieve();

        // Traverse the array
        for (int i = 0; i < len; i++) {

            // If the current element is prime
            if (isPrime[arr[i]]) {

                // Shift all the elements on the
                // right of it to the left
                for (int j = i; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                // Decrease the loop counter by 1
                // to check the shifted element
                i--;

                // Decrease the length
                len--;
            }
        }

        // Print the updated array
        printArray(arr, len);
    }

    public static void fileHandler(String input) throws IOException {

        Scanner myObj = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("test.txt");
            for (int i = 0; i < 10; i++) {

                fw.write(input);
                // close the file
            }
            fw.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }

    // Driver code
    public static void main(String[] args) throws FileNotFoundException {
        int arr[] = new int[10];
        File obj = new File("test.txt");
        try (Scanner read = new Scanner(obj)) {
            for (int i = 0; i < arr.length; i++) {
                int data = read.nextInt();
                arr[i] = data;
            }

            int len = arr.length;
            removePrimes(arr, len);

        }
    }
}