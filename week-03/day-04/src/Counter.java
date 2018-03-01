import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(countDown(n));
  }

  private static int countDown(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return countDown(n-1);
    }
  }

}
