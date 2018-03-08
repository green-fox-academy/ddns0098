import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  @Test
  public void fibonacciTest() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(5,fibonacci.fibonacci(5));
  }

  @Test
  public void fibonacciTestZero() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(0,fibonacci.fibonacci(0));
  }

  @Test
  public void fibonacciTestNegative() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(0,fibonacci.fibonacci(-1));
  }
}