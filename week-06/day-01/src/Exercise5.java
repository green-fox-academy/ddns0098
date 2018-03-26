import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    List<Character> chars = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      chars.add(str.charAt(i));
    }
    chars
            .stream()
            .filter(Character::isUpperCase)
            .forEach(System.out::print);
  }
}
