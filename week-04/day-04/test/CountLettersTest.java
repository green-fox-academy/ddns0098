import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
  @Test
  public void dictionaryTest() {
    CountLetters countLetters = new CountLetters();
    String str = "apple";
    Map<String,Integer> map = new HashMap<>();
    map.put("a",1);
    map.put("p",2);
    map.put("e",1);
    map.put("l",1);
    assertEquals(map, countLetters.dictionary(str));
  }
}