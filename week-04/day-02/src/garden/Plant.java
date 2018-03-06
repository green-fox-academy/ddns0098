package garden;

public class Plant {
  private String name;
  private double waterAmount;
  private double consume;
  private int wateringNeeded;
  private String type;

  public Plant(String name, double waterAmount) {
    this.name = name;
    this.waterAmount = waterAmount;
  }

  public void setConsume(double consume) {
    this.consume = consume;
  }

  public void watering(double water) {
    waterAmount += water * consume;
  }

  public String getName() {
    return name;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWateringNeeded(int wateringNeeded) {
    this.wateringNeeded = wateringNeeded;
  }

  public int getWateringNeeded() {
    return wateringNeeded;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean needWater() {
    if (getWaterAmount() < getWateringNeeded()) {
      return true;
    }
    return false;
  }
}
