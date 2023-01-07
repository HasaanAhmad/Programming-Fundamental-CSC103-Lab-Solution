public class GLT2 {
    public static void main(String[] args) {
        int x, y, z, w;
        x = 3;
        y = 4;
        z = 7;
        w = 1;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != z: " + (x != z));
        System.out.println("y == z - 3: " + (y == z - 3));
        System.out.println("!(z > w): " + !(z > w));
        System.out.println("x + y < z: " + (x + y < z));
    }
}
