
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(factorio(number, number));
    }


    public static int factorio(int factorial, int multiplier){
        multiplier--;
        factorial *= multiplier;
        if (multiplier > 1){
            return factorio(factorial, multiplier);
        }

        return factorial;
    }
}
