import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String path = "duplicated-chars.txt";
    decryptMethod(path);

  }

  private static void decryptMethod(String path) {
    Path newFile = Paths.get("decoded.txt");
    List<String> decodedFile = new ArrayList<>();
    try {
      Path filePath = Paths.get(path);
      List<String> lines = Files.readAllLines(filePath);
      for (String line:lines) {
        String decodedLine = "";
        //System.out.println(line);
        if (line.trim().isEmpty()) {
          decodedFile.add(decodedLine);
          continue;
        } else {
          char[] chars = line.toCharArray();
          decodedLine += chars[0];
          for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
              decodedLine += chars[i];
            }
          }
        }
          //System.out.println(decodedLine);
          decodedFile.add(decodedLine);
        }
      Files.write(newFile, decodedFile);
    } catch (Exception e){
      System.out.println("Unable to read file");
    }
  }
}