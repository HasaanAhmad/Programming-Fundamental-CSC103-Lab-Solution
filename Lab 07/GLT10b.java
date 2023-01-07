
import java.io.*;

class GLT10b {

    static int find(int decimal_number) {
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 2 + 10 *
                    find(decimal_number / 2));
    }

    // Driver Code
    public static void main(String args[]) {
        int decimal_number = 10;
        System.out.println(find(decimal_number));
    }

}
