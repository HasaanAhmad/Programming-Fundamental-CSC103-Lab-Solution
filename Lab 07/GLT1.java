/*
 * Name : Hasaan Ahmad
 * Roll No: SP22-BSE-017
 * Programming Fundamentals 
 * Lab 07
 */

public class GLT1 {
    public static void main(String[] args) {

        System.out.println(sumDigits(234));
    }

    public static int sumDigits(long n) {
        int x = (int) Math.abs(n);
        int sum = 0;

        while (x != 0) {
            sum += (x % 10);
            x = x / 10;
        }

        return sum;
    }
}