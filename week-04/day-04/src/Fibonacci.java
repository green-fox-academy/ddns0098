public class Fibonacci {
  public int fibonacci(int n) {
    int base1 = 0;
    int base2 = 1;
    int fibo = 0;
    for (int i = 0; i < n - 1; i++) {
      fibo = base1+base2;
      base1 = base2;
      base2 = fibo;
    }
    return fibo;
  }
}
