import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend){
            if (numberOfCups >= 15 && numberOfCups <= 25){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (!isWeekend) {
            if (numberOfCups >= 10 && numberOfCups <= 20){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}