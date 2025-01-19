import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
        int squareOfN = n * n;
        System.out.println(squareOfN);

        // Compute and print the cube of n
        int cubeOfN = n * n * n;
        System.out.println(cubeOfN);

        // Compute and print the fourth power of n
        int fourthPowerOfN = n * n * n * n;
        System.out.println(fourthPowerOfN);
    }
}