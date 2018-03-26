import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    str.chars()
            .mapToObj(c -> (char) c)
            .filter(Character::isUpperCase)
            .forEach(System.out::print);
  }
}
