import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    String path = "reversed-order.txt";
    decryptMethod(path);
  }

  private static void decryptMethod(String path) {
    Path newFile = Paths.get("decodedOrder.txt");
    try {
      Path filePath = Paths.get(path);
      List<String> lines = Files.readAllLines(filePath);
      Collections.reverse(lines);
      //System.out.println(lines);
      Files.write(newFile, lines);
    } catch (Exception e){
      System.out.println("Unable to read file");
    }
  }
}