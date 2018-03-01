import java.util.Scanner;

public class StringsAgain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    int size = str.length();
    String newStr = "";
    System.out.println(charChange(str, size, newStr));
  }

  private static String charChange(String str, int size, String newStr) {
    if (size == 0) {
      return newStr;
    } else if (str.charAt(size-1) == 'x') {
      return charChange(str,size-1, newStr);
    } else {
      newStr = str.charAt(size-1) + newStr;
      return charChange(str,size-1, newStr);
    }
  }
}
