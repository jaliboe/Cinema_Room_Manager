import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int division = input % 2;
        System.out.println(division);
        System.out.println(division * 3);
        scanner.close();
    }
}