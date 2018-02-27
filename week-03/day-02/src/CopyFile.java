import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String path1 = "my-file.txt";
    String path2 = "my-file2.txt";
    System.out.println(copyFunction(path1, path2));
  }

  private static boolean copyFunction(String path1, String path2) {
    try {
      Path firstPath = Paths.get(path1);
      Path secondPath = Paths.get(path2);
      Files.copy(firstPath, secondPath);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
