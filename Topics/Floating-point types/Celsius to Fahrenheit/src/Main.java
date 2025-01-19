import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double tempC = scanner.nextDouble();
        double tempF = (tempC * 1.8) + 32;
        System.out.println(tempF);
        scanner.close();
    }
}