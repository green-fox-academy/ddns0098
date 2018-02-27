import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    String path = "reversed-lines.txt";
    decryptMethod(path);
  }

  private static void decryptMethod(String path) {
    Path newFile = Paths.get("decodedReversed.txt");
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
          for (int i = chars.length-1; i >= 0; i--) {
            decodedLine += chars[i];
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