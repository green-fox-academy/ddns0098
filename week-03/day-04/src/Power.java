import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int power = scanner.nextInt();

    System.out.println(powerN(n, power));
  }

  private static int powerN(int n, int power) {
    if (power == 0) {
      return 1;
    } else {
      return n * powerN(n, power - 1);
    }
  }
}
