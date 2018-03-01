import java.util.Scanner;

public class BunnySecond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(countEars(n));
  }

  private static int countEars(int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 0) {
      return 3 + countEars(n-1);
    } else {
      return 2 + countEars(n-1);
    }
  }
}
