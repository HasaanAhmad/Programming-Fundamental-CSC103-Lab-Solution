/*
 * Name : Hasaan Ahmad
 * Roll No: SP22-BSE-017
 * Programming Fundamentals 
 * Lab 07
 */
public class GLT5 {
    public static void main(String[] args) {
        countLetters("Hello how are you?");
    }

    public static void countLetters(String s) {
        int count = 0;

        // Counts each character except space
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
        }

        // Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }

}