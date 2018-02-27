import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(divideFunction(number));
  }

  private static double divideFunction(int number) {
    double result = 0;
    try {
      result = 10 / number;
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
    return result;
  }
}
