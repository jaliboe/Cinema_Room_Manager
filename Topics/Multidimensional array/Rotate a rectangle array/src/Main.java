import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] oldArr = new int[rows][cols];
        int[][] newArr = new int[cols][rows];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                oldArr[i][j] = scanner.nextInt();
                newArr[j][rows - 1 - i] = oldArr[i][j];
            }
        }

        for (int k = 0; k < newArr.length; k++){
            for ( int l = 0; l < newArr[k].length; l++){
                System.out.print(newArr[k][l] + " ");
            }
            System.out.println();
        }
    }
}