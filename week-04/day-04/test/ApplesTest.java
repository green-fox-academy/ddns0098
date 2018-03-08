import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void applesTest() {
    Apples apples = new Apples();
    assertEquals("apple", apples.getApple());
  }
}