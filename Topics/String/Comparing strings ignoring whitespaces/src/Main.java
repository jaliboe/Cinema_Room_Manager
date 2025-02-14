import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        boolean isEqual = false;

        line1 = line1.replace(" ", "");
        line2 = line2.replace(" ", "");

        if (line1.equals(line2)) {
            isEqual = true;
        } else {
            isEqual = false;
        }

        System.out.println(isEqual);
    }
}