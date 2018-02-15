import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(number2 < number1){
            System.out.println("The second number should be bigger");
        }else{
            for (int i = number1; i < number2 ; i++) {
                System.out.println(i);

            }
        }
    }
}
