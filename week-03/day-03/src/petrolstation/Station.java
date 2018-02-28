package petrolstation;

public class Station {
  private int gasAmount = 1000;

  public void refill(Car car) {
    this.gasAmount -= car.capacity - car.gasAmount;
    car.gasAmount = car.capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
