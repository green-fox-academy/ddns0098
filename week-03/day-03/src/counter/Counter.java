package counter;

public class Counter {
  private int value = 0;
  private int initValue = 0;

  public void add(int number) {
    this.value += number;
  }

  public void add() {
    this.value++;
  }

  public int get() {
    return value;
  }

  public Counter(int number) {
    initValue = number;
    value = number;
  }

  public Counter() {
  }



  public void reset() {
    value = initValue;
  }

  public static void main(String[] args) {

  }
}
