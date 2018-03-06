package garden;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addFlower(new Flower("yellow", 3));
    garden.addFlower(new Flower("blue", 3));
    garden.addTree(new Tree("purple", 2));
    garden.addTree(new Tree("orange", 5));
    garden.info();
    garden.setWater(70);
    garden.watering();
    garden.info();
  }
}
