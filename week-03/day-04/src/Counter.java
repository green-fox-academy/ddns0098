import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    countDown(n);
  }

  private static void countDown(int n) {
    if (n == 0) {
      System.out.println(0);
    } else {
      System.out.println(n);
      countDown(n-1);
    }
  }

}
