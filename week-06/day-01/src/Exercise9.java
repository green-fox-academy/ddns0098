import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    Character[] chars = {'k','a','m','i','k','a','z','e'};
    String str = Arrays.stream(chars)
            .map(Object::toString)
            .collect(Collectors.joining());
    System.out.println(str);
  }
}
