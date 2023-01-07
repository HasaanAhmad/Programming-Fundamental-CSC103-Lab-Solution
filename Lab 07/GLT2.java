/*
 * Name : Hasaan Ahmad
 * Roll No: SP22-BSE-017
 * Programming Fundamentals 
 * Lab 07
 */
class GLT2 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(isPalindrone(123));

    }

    public static int reverse(int num) {
        String reversedNumber = "";

        while (num != 0) {
            reversedNumber += num % 10;
            num = num / 10;
        }
        return (Integer.parseInt(reversedNumber));
    }

    public static boolean isPalindrone(int num) {
        if (num == reverse(num))
            return true;
        return false;
    }
}