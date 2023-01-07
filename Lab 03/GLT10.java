public class GLT10 {
    public static void main(String[] args) {
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        // Display the Data of the table using System.out.printf()
        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);
        // DISPLAYING THE DATA IN FORMATED WAYS
        System.out.printf("%d %14.4f %10.4f %9.4f %9.4f", degrees, radians, sin, cos, tan);
    }
}
