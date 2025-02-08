import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int dayNumber = scanner.nextInt();
        String outputDay;

        // Use a switch statement to determine the day of the week
        switch (dayNumber) {
            case 1:
                outputDay = "Monday";
                break;
            case 2:
                outputDay = "Tuesday";
                break;
            case 3:
                outputDay = "Wednesday";
                break;
            case 4:
                outputDay = "Thursday";
                break;
            case 5:
                outputDay = "Friday";
                break;
            case 6:
                outputDay = "Saturday";
                break;
            case 7:
                outputDay = "Sunday";
                break;
            default:
                outputDay = "Invalid input";
        }

        System.out.print(outputDay);

        scanner.close();
    }
}