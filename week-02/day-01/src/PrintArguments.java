import java.util.Scanner;

public class PrintArguments {
    public static void main (String[] args){
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String line = scanner.nextLine();
        printer(line);

    }

    public static void printer (String... input){
        for (String arg : input) {
            System.out.print(arg);
        }
    }
}
