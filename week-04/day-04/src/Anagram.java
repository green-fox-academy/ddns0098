import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String str1, String str2) {
    if (str1.length() == str2.length()) {
      char[] chars1 = str1.toCharArray();
      char[] chars2 = str2.toCharArray();
      Arrays.sort(chars1);
      Arrays.sort(chars2);
      String sorted1 = new String(chars1);
      String sorted2 = new String(chars2);

      return sorted1.equals(sorted2);
    }
    return false;
  }
}
