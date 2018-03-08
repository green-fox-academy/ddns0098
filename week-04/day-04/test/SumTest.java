import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumTest() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    assertEquals(6, sum.sum(list));
  }

  @Test
  public void sumTestEmpty() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();

    assertEquals(0, sum.sum(list));
  }

  @Test
  public void sumTestOne() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);

    assertEquals(1, sum.sum(list));
  }

  @Test(expected = NullPointerException.class)
  public void sumTestNull() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(null);

    assertEquals(6, sum.sum(list));
  }
}