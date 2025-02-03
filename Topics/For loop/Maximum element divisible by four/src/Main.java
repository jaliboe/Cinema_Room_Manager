import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int maxNumber = 0;

        for (int i = n; i > 0; i--){
            int number = scanner.nextInt();
            if (number <= 1000 && number % 4 == 0 && number > maxNumber){
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
        scanner.close();
    }
}