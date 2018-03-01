import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(numberAdder(n));
  }

  private static int numberAdder(int n) {
    if (n == 1) {
      return n;
    } else {
      return n+numberAdder(n-1);
    }
  }
}
