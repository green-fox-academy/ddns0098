package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

  private static int slots = 10;

  public static void breed() {
    if (animals.size() < slots) {
      animals.add(new Animal());
    }
  }

  public static  void slaughter() {
    int min = 50;
    int minIndex = 0;
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).getHunger() < min) {
        min = animals.get(i).getHunger();
        minIndex = i;
      }
    }
    animals.remove(minIndex);
  }

  public static void main(String[] args) {
    initAnimals();
    breed();
    slaughter();
    System.out.println(animals.size());
  }


    static List<Animal> animals = new ArrayList<Animal>(slots);

    static void initAnimals(){
      animals.add(new Animal());
      animals.add(new Animal());
      animals.add(new Animal());
      animals.add(new Animal());
    }

}
