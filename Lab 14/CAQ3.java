import java.util.Scanner;

public class CAQ3 {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(1));
        System.out.println(dayOfTheWeek(3));
        System.out.println(dayOfTheWeek(4));
    }

    public static String dayOfTheWeek(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }

        return dayName;
    }
}
