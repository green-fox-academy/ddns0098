package aircraftcarrier;

import org.omg.CORBA.NO_RESOURCES;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> carrier = new ArrayList<>();
  private int ammoStorage;
  private int health;
  private int totalDamage;

  public Carrier(int ammoStorage, int health) {
    this.ammoStorage = ammoStorage;
    this.health = health;
  }

  public void addAircraft(String type) {
    if (type.equalsIgnoreCase("f16")) {
      carrier.add(new F16());
    } else if (type.equalsIgnoreCase("f35")){
      carrier.add(new F35());
    }
  }

  public void fill() {
    int neededAmmo = 0;
    if (ammoStorage == 0) {
      throw new NO_RESOURCES();
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        neededAmmo += carrier.get(i).getMaxAmmo();
      }
      if (neededAmmo > ammoStorage) {
        fillAircraft("F35");
      } else {
        fillAircraft("F35");
        fillAircraft("F16");
      }
      if (ammoStorage > 0) {
        fillAircraft("F16");
      }
    }
  }

  private void fillAircraft(String type) {
    for (int i = 0; i < carrier.size(); i++) {
      Aircraft currentAircraft = carrier.get(i);
      if (currentAircraft.getType().equals(type)) {
        for (int j = ammoStorage; j > 0; j--) {
          if (currentAircraft.getAmmoStore() < currentAircraft.getMaxAmmo()) {
            currentAircraft.setAmmoStore(currentAircraft.getAmmoStore()+1);
            ammoStorage--;
          }
        }
      }
    }
  }

  public void fight(Carrier enemyCarrier) {
    int damage = 0;
    for (int i = 0; i < carrier.size(); i++) {
      damage += carrier.get(i).fight();
    }
    enemyCarrier.health -= damage;
    System.out.println("Enemy carrier health: " + enemyCarrier.health);
  }

  public void getStatus() {
    if (health == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        totalDamage += carrier.get(i).getAmmoStore()*carrier.get(i).getBaseDamage();
      }
      System.out.println("HP: " + health + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " + ammoStorage + ", Total damage: " + totalDamage);
      System.out.println("Aircrafts: ");
      for (int i = 0; i < carrier.size(); i++) {
        System.out.println(carrier.get(i).getStatus());
      }
    }
  }
}
