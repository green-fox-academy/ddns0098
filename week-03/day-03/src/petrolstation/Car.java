package petrolstation;

public class Car {
  int gasAmount;
  int capacity;

  public Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
