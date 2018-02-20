import java.util.*;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();

        System.out.println("Result = " + calculate(operation, operand1, operand2));
    }

    public static double calculate(char operation, double input1, double input2){
        if (operation == '+') {
            return input1 + input2;
        }else if (operation == '-') {
            return input1 - input2;
        }else if (operation == '*') {
            return input1 * input2;
        }else if (operation == '/') {
            if (input2 != 0) {
                return input1 / input2;
            }else {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        }else if (operation == '%') {
            return input1 % input2;
        }else {
            System.out.println("Invalid Operation!!!");
            return 0;
        }
    }
}