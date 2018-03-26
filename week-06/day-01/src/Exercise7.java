import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    List<Character> chars = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      chars.add(str.charAt(i));
    }
    System.out.println(chars
            .stream()
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
