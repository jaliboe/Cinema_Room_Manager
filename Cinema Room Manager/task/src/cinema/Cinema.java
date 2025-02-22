package cinema;
import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of rows:\n> ");
        int row = sc1.nextInt();
        System.out.print("Enter the number of seats in each row\n> ");
        int col = sc1.nextInt();

        System.out.println();

        char[][] seats = new char[row][col];

        boolean run = true;
        int ticketsSold = 0;
        int seatsTotal = row * col;
        float soldPercentage = 0.0f;
        float currentIncome = 0.0f;
        int rowSelected = 0;
        int colSelected = 0;
        int ticketPrice = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'S';
            }
        }

        float totalIncome = calcTotalIncome(seats);

        while (run) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            System.out.print("> ");
            int menuChoice = sc1.nextInt();
            System.out.println();

            switch (menuChoice) {
                case 1:
                    System.out.println("Cinema:");

                    System.out.print("  ");
                    for (int i = 1; i < col + 1; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();

                    for (int i = 0; i < seats.length; i++) {
                        System.out.print(i + 1 + " ");
                        for (int j = 0; j < seats[i].length; j++) {
                            System.out.print(seats[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("Enter a row number:");
                        System.out.print("> ");
                        rowSelected = sc1.nextInt();

                        if (rowSelected < 1 || rowSelected > row) {
                            System.out.println("Wrong input!");
                            System.out.println();
                            continue;
                        }

                        System.out.println("Enter a seat number in that row:");
                        System.out.print("> ");
                        colSelected = sc1.nextInt();

                        if (colSelected < 1 || colSelected > col) {
                            System.out.println("Wrong input!");
                            System.out.println();
                            continue;
                        }

                        if (seats[rowSelected - 1][colSelected - 1] == 'B') {
                            System.out.println();
                            System.out.println("That ticket has already been purchased");
                            System.out.println();
                            continue;
                        }

                        validInput = true;
                    }
                        seats[(rowSelected - 1)][(colSelected - 1)] = 'B';
                        if (seatsTotal <= 60) {
                            ticketPrice = 10;
                        } else if (row % 2 == 0) {
                            if (rowSelected <= 5) {
                                ticketPrice = 10;
                            } else if (rowSelected >= 6) {
                                ticketPrice = 8;
                            }
                        } else if (row % 2 != 0) {
                            if (rowSelected <= 4) {
                                ticketPrice = 10;
                            } else if (rowSelected >= 5) {
                                ticketPrice = 8;
                            }
                        }

                        ticketsSold++;
                        soldPercentage = ((float) ticketsSold / seatsTotal) * 100;
                        currentIncome += ticketPrice;

                        System.out.print("Ticket price: $" + ticketPrice + "\n");
                        System.out.println();
                    break;
                case 3:
                    System.out.printf("Number of purchased tickets: %d", ticketsSold);
                    System.out.printf("%nPercentage: %.2f%%", soldPercentage);
                    System.out.printf("%nCurrent Income: $%.0f", currentIncome);
                    System.out.printf("%nTotal Income: $%.0f%n", totalIncome);

                    System.out.println();


                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }

    public static float calcTotalIncome(char[][] seats) {

        int row = seats.length;
        int col = seats[0].length;
        int seatsTotal = row * col;
        float totalIncome = 0.0f;

        for (int i = 0; i < seats.length; i++) {
            if (seatsTotal <= 60) {
                totalIncome = seatsTotal * 10;
            } else {
                int frontHalf;
                int backHalf;

                if (row % 2 == 0) {
                    frontHalf = row / 2;
                    backHalf = row / 2;
                } else {
                    frontHalf = row / 2;
                    backHalf = row / 2 + 1;
                }

                totalIncome = (frontHalf * col * 10) + (backHalf * col * 8);
            }
        }
        return totalIncome;
    }
}
