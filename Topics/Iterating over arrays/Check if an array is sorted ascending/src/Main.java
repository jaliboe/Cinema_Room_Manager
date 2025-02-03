import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int arraysSize = scanner.nextInt();
        int[] lastMax = new int[arraysSize];
        lastMax[0] = scanner.nextInt();
        int[] currentNum = new int[arraysSize];
        boolean ascending = true;

        int i;
        for (i = 0; i < arraysSize - 1; i++) {
            currentNum[i] = scanner.nextInt();
            if (currentNum[i] > lastMax[0]) {
                lastMax[0] = currentNum[i];
                ascending = true;
            } else if (currentNum[i] < lastMax[0]){
                ascending = false;
                break;
            }
        }

        System.out.println(ascending);
    }
}