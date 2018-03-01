import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int base1 = 0;
    int base2 = 1;
    System.out.println(fibonacci(n, base1, base2));
  }

  private static int fibonacci(int n, int base1, int base2) {
    if (n == 1) {
      return base1 + base2;
    } else {
      return fibonacci(n-1, base2, base1+base2);
    }
  }
}
