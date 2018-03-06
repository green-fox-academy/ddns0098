package garden;

public class Flower extends Plant {
  public Flower(String name, double waterAmount) {
    super(name, waterAmount);
    setConsume(0.75);
    setWateringNeeded(5);
    setType("Flower");
  }
}
