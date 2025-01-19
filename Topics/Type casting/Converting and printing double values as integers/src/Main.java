import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        // TODO: Write your code here to read a double from the console
        double input = scanner.nextDouble();

        // Convert and print the number to an integer.
        int output = (int)input;
        System.out.println(output);

        // TODO: Write your code here to convert the double to an integer and print it out to the console

        scanner.close();
    }
}