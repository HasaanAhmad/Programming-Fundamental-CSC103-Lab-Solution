import java.util.Scanner;

public class GLT4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter non negative integers sequence, where each number is in a separate line:");
        String sequence = input.nextLine();
        int count = 0;
        int i = 0;
        boolean condition = true;
        while (i < sequence.length() && condition == true) {
            if (sequence.charAt(i) == '0') {
                // break;
                condition = false;
            } else {
                count += 1;
                i++;
            }
        }
        System.out.print("length of sequence before zero is " + count);
    }
}