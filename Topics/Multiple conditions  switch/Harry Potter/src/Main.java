import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputHouse = scanner.next();
        String outputMeaning;

        switch (inputHouse) {
            case "gryffindor":
                outputMeaning = "bravery";
                break;
            case "hufflepuff":
                outputMeaning = "loyalty";
                break;
            case "slytherin":
                outputMeaning = "cunning";
                break;
            case "ravenclaw":
                outputMeaning = "intellect";
                break;
            default:
                outputMeaning = "not a valid house";
        }

        System.out.print(outputMeaning);
    }
}