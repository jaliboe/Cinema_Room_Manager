import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     * 
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {

        long sum = 0;

        if (from == to){
            sum = 0;
        } else {
            for (int i = 0; i < (to - from); i++) {
                sum += from + i;
            }
        }

        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    } 
}