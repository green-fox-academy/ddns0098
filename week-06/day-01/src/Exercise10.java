import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
  static class Fox {
    private String name;
    private String type;
    private String color;

    public Fox(String name, String type, String color) {
      this.name = name;
      this.type = type;
      this.color = color;
    }
  }

  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Bob", "macrotis", "red"));
    foxes.add(new Fox("Gabe", "macrotis", "green"));
    foxes.add(new Fox("Mike", "macrotis", "blue"));
    foxes.add(new Fox("Jake", "pallida", "green"));
    foxes.add(new Fox("Kayle", "pallida", "green"));

    System.out.println("Green foxes");
    foxes
            .stream()
            .filter(fox -> fox.color.equalsIgnoreCase("green"))
            .map(fox -> fox.name + " ")
            .forEach(System.out::print);
    System.out.println();
    System.out.println("Green pallida foxes");
    foxes
            .stream()
            .filter(fox -> fox.color.equalsIgnoreCase("green") && fox.type.equalsIgnoreCase("pallida"))
            .map(fox -> fox.name + " ")
            .forEach(System.out::print);
  }
}
