import java.util.ArrayList;
import java.util.Arrays;

public class Exercise6 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    cities
            .stream()
            .filter(s -> s.startsWith("A"))
            .filter(s -> s.endsWith("I"))
            .map(s -> s + " ")
            .forEach(System.out::print);
  }
}
