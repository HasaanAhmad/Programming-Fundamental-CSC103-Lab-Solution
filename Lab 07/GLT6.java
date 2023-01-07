/*
 * Name : Hasaan Ahmad
 * Roll No: SP22-BSE-017
 * Programming Fundamentals 
 * Lab 07
 */
public class GLT6 {

    public static void main(String[] args) {
        System.out.println(capitalize("hello"));
        ;
    }

    public static String capitalize(String a) {
        String Ans = "";
        // first substring contains first letter of name
        // second substring contains remaining letters
        String firstLetter = a.substring(0, 1);
        String remainingLetters = a.substring(1, a.length());

        // change the first letter to uppercase
        firstLetter = firstLetter.toUpperCase();

        // join the two substrings
        Ans = firstLetter + remainingLetters;
        return Ans;

    }
}
