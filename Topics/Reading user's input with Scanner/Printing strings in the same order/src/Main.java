import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[4];

        for (int i = 0; i < 4; i++){
            words[i] = sc.next();
        }

        System.out.println();

        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        sc.close();
    }
}