import java.util.Scanner;

public class BunnyFirst {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(countEars(n));
  }

  private static int countEars(int n) {
    if (n == 0) {
      return 0;
    } else {
      return 2 + countEars(n-1);
    }
  }

}
