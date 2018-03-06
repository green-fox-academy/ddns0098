package garden;

public class Tree extends Plant{
  public Tree(String name, double waterAmount) {
    super(name, waterAmount);
    setConsume(0.4);
    setWateringNeeded(10);
    setType("Tree");
  }
}
