import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(sumDigit(n));
  }

  private static int sumDigit(int n) {
    if (n == 0) {
      return 0;
    } else {
      return n % 10 + sumDigit(n / 10);
    }
  }
}
