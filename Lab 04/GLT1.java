public class GLT1 {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 15;
        z = 20;
        System.out.println(!(x > 10));
        System.out.println(x <= 5 || y < 15);
        System.out.println((x != 5) && (y != z));
        System.out.println(x >= z || (x + y >= z));
        System.out.println((x <= y - 2) && (y >= z) || (z - 2 != 20));
    }
}
