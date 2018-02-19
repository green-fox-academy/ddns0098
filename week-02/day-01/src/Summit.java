import java.util.Scanner;

public class Summit {
    public static void main (String[] args){
        //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many number you want to add: ");
        int numbers = scanner.nextInt();
        System.out.println(sum(numbers));
    }

    public static int sum(int input){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        for (int i = 0; i < input; i++) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            sum+=number;
        }
        return sum;
    }
}
