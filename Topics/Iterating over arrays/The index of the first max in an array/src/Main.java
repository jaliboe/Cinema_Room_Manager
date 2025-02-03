import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int lengthArr = scanner.nextInt();
        int indexOfMax = 0;
        int max = 0;

        for (int i = 0; i < lengthArr; i++){
            int currentInt = scanner.nextInt();
            if (currentInt > max){
                indexOfMax = i;
                max = currentInt;
            }
        }

        System.out.println(indexOfMax);
    }
}