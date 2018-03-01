import java.util.Scanner;

public class Refactorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(factorio(n));
  }

  private static int factorio(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorio(n-1);
    }
  }
}
