public class GLT9 {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    public static int power(int a, int n) {
        if (n != 0) {
            return a * power(a, n - 1);
        }
        return 1;
    }
}