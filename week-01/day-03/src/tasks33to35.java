import java.util.Scanner;
import java.util.Random;

public class tasks33to35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("#####Guess the number!#####");
        System.out.println("\t Enter the maximum of the numbers: ");
        int maxNumbers = scanner.nextInt();
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int generatedNumber = rand.nextInt(maxNumbers)+1;
        int guessedNumber;
        boolean wonTheGame = false;
        while(wonTheGame != true) {
            System.out.println("Try to guess the generated number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber < generatedNumber){
                System.out.println("The generated number is higher!");
            }else if(guessedNumber > generatedNumber){
                System.out.println("The generated number is lower!");
            }else if(guessedNumber==generatedNumber){
                wonTheGame = true;
                System.out.println("/////###Congrats! You guessed correctly!###\\\\\\\\\\");
            }
        }

        System.out.println();

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int sum=0;
        double avg=0;
        int numToAdd;

        for (int i = 0; i <number ; i++) {
            System.out.println("Enter the number you want to add:");
            numToAdd=scanner.nextInt();
            sum+=numToAdd;
        }
        avg=(double)sum/(double)number;

        System.out.println("Sum: " + sum + ", Average: " + avg);

        System.out.println();

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        int i=1;
        while(i<9){
            if(i%2 == 0){
                for (int j = 1; j <9 ; j++) {
                    if(j%2 == 0){
                        System.out.print("%");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }else{
                for (int j = 1; j <9 ; j++) {
                    if(j%2 == 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("%");
                    }
                }
                System.out.print("\n");
            }
            i++;
        }
    }
}
