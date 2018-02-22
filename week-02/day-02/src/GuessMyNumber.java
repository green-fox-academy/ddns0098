import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    static int lives = 5;
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        gameLoop(startUpTheGame());
    }

    private static void gameLoop(int generatedNumber) {
        while (lives > 0) {
            System.out.println("You have " + lives + " left!");
            System.out.println("Try to guess my number:");
            int number = scanner.nextInt();
            checkTheNumber(number, generatedNumber);
        }
        System.out.println("Hah... You lost!");
        return;
    }

    private static void checkTheNumber(int number, int generatedNumber) {
        if (number < generatedNumber) {
            lives--;
            System.out.println("Too low!");
        } else if (number > generatedNumber) {
            lives--;
            System.out.println("Too high!");
        } else {
            System.out.println("Congrats... You won this time...");
            System.exit(1);
        }
    }

    private static int startUpTheGame() {
        System.out.println("Set the boundaries:");
        int bound = scanner.nextInt();
        System.out.println("I found a number between 1-" + bound + ".");
         return rand.nextInt(bound) + 1;
    }


}


