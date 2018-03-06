package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> garden = new ArrayList();
  private double water;

  public void addTree(Tree tree) {
    garden.add(tree);
  }

  public void addFlower(Flower flower) {
    garden.add(flower);
  }

  public void setWater(double water) {
    this.water = water;
  }

  public void watering() {
    System.out.println("Watering with " + water + ".");
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needWater()) {
        garden.get(i).watering(water/garden.size());
      }
    }
  }

  public void info() {
    for (int i = 0; i < garden.size(); i++) {
      Plant currentPlant = garden.get(i);
      System.out.print("The " + currentPlant.getName() + " " + currentPlant.getType() + " ");
      if (currentPlant.needWater()) {
        System.out.println("needs water.");
      } else {
        System.out.println("doesn't need water.");
      }
    }
  }
}
