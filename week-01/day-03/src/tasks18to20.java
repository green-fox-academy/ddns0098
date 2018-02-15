import java.util.Scanner;

public class tasks18to20 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println();

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        System.out.println("Enter a number: ");
        number =scanner.nextInt();
        if(number <= 0){
            System.out.println("Not enough");
        }else if(number == 1){
            System.out.println("One");
        }else if(number == 2){
            System.out.println("Two");
        }else{
            System.out.println("A lot");
        }
        System.out.println();

        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
