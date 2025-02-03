import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int lengthArr = scanner.nextInt();
        int[] max = new int[2];
        int maxProd = 0;

        for (int i = 0; i < lengthArr; i++){
            int currentInt = scanner.nextInt();

            if (currentInt > max[0]){
                max[0] = currentInt;
            } else if (currentInt > max[1]){
                max[1] = currentInt;
            } else if (currentInt == max[0] && currentInt > max[1]){
                max[1] = currentInt;
            }
        }

        maxProd = max[0] * max[1];
        System.out.println(maxProd);
    }
}