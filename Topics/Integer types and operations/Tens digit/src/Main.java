import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input = scanner.nextInt();

        int tens = (input % 100) /10;
        System.out.println(tens);

        double radius = 5.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println(volume);
    }
}