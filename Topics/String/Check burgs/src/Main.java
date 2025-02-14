import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        boolean endBurg = false;

        if (cityName.endsWith("burg")) {
            endBurg = true;
        } else {
            endBurg = false;
        }

        System.out.println(endBurg);
    }
}