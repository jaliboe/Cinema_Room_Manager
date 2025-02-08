import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        isDivByThreeAndFive(num);
    }
    // function isDivByThree will be here
    public static void isDivByThree(int a) {
        if (a % 3 == 0) {
            System.out.println("Fizz");
        } else {
            isDivByFive(a);
        }
    }

    // function isDivByFive will be here
    public static void isDivByFive(int a) {
        if (a % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }
    }

    // function isDivByThreeAndFive will be here
    public static void isDivByThreeAndFive(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            isDivByThree(a);
        }
    }
}