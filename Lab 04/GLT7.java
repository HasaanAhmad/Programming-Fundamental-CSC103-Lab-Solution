import java.util.Scanner;

public class GLT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l1, l2, w1, w2;
        System.out.println("Enter the length and width of Rectangle in Meters(m)");
        l1 = input.nextDouble();
        w1 = input.nextDouble();
        System.out.println("Enter the length and width of Other Rectangle in Meters(m)");
        l2 = input.nextDouble();
        w2 = input.nextDouble();
        double AreaOfRec1 = (l1 * w1);
        double AreaOfRec2 = (l2 * w2);
        if (AreaOfRec1 > AreaOfRec2) {
            System.out.println("The area of first Rectange is " + AreaOfRec1
                    + " which is greater than the area of Second Rectangle which is " + AreaOfRec2);

        } else if (AreaOfRec2 > AreaOfRec1) {
            System.out.println("The area of first Rectange is " + AreaOfRec1
                    + " which is lesser than the area of Second Rectangle which is " + AreaOfRec2);
        } else {
            System.out.println("Both the Rectangles are same");
        }

    }
}
