import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double gravity = 9.8;

        double liquidPressure = density * gravity * height;

        System.out.println(liquidPressure);

        scanner.close();
    }
}