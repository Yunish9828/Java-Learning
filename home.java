import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for a day of the week (1 for Sunday, 2 for Monday, etc.): ");
        int dayNumber = scanner.nextInt();

        String weekdayName = getWeekdayName(dayNumber);

        if (weekdayName != null) {
            System.out.println("The weekday is: " + weekdayName);
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    public static String getWeekdayName(int dayNumber) {
        String weekdayName;

        switch (dayNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = null; // Invalid day number
        }

        return weekdayName;
    }
}
