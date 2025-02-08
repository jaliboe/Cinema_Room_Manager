import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numOfDirection = scanner.nextInt();
        String outputAction;

        switch (numOfDirection){
            case 0:
                outputAction = "do not move";
                break;
            case 1:
                outputAction = "move up";
                break;
            case 2:
                outputAction = "move down";
                break;
            case 3:
                outputAction = "move left";
                break;
            case 4:
                outputAction = "move right";
                break;
            default:
                outputAction = "error!";
        }

        System.out.print(outputAction);
    }
}