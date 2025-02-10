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

        char[][] seats = new char[row][col];

        boolean run = true;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'S';
            }
        }

        while (run) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
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
                    System.out.print("Enter a row number:\n> ");
                    int rowSelected = sc1.nextInt();
                    System.out.print(("Enter a seat number in that row:\n> "));
                    int colSelected = sc1.nextInt();

                    seats[(rowSelected - 1)][(colSelected - 1)] = 'B';

                    int ticketPrice = 0;
                    int seatsTotal = row * col;

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

                    System.out.print("Ticket price: $" + ticketPrice + "\n");

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
}