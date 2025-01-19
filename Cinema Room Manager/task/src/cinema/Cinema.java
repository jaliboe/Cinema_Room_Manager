package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        System.out.println("Cinema:");
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 9; j++){
                if (i == 0){
                    if (j == 0){
                        System.out.print("  ");
                    } else {
                        System.out.print(j + " ");
                    }
                } else if (j == 0){
                    if (i > 0){
                        System.out.print(i + " ");
                    }
                } else {
                    System.out.print("S ");
                }
            }
            System.out.print("\n");
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of rows:\n> ");
        double row = sc1.nextInt();

        System.out.print("Enter the number of seats in each row:\n> ");
        double seatsInRow = sc1.nextInt();
        sc1.close();

        double seatsTotal = row * seatsInRow;
        double totalIncome = 0;


        if (seatsTotal <= 60){
            totalIncome = seatsTotal * 10;
        } else if (row % 2 == 0){
            totalIncome = ((row / 2) * seatsInRow) * 10;
            totalIncome += ((row / 2) * seatsInRow) * 8;
        } else if (row % 2 != 0){
            totalIncome = ((row / 2 - 0.5) * seatsInRow) * 10;
            totalIncome += ((row / 2 + 0.5) * seatsInRow) * 8;
        }

        System.out.print("Total income:\n$" + totalIncome);
    }
}