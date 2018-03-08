import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public Map dictionary(String str) {
    Map<String,Integer> map = new HashMap();
    for (int i = 0; i < str.length(); i++) {
      map.merge(String.valueOf(str.charAt(i)),1,Integer::sum);
    }
    return map;
  }
}