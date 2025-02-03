import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int totalNums = scanner.nextInt();
        int num = 0;

        while (totalNums > 0){
            num = scanner.nextInt();
            if (num > max){
                if (num % 4 == 0){
                    max = num;
                }
            }
            totalNums--;
        }

        System.out.println(max);
        scanner.close();
    }
}