import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numTotal = scanner.nextInt();

        String grade = "";

        int aGrade = 0;
        int bGrade = 0;
        int cGrade = 0;
        int dGrade = 0;

        for (int i = numTotal; i > 0; i--){
            grade = scanner.next();
            if (Objects.equals(grade, "A")){
                aGrade++;
            } else if (Objects.equals(grade, "B")){
                bGrade++;
            } else if (Objects.equals(grade, "C")){
                cGrade++;
            } else if (Objects.equals(grade, "D")){
                dGrade++;
            }
        }

        System.out.println(dGrade + " " + cGrade + " " + bGrade + " " + aGrade);

    }
}