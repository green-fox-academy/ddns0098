package aircraftcarrier;

public class Aircraft {
  private String type;
  private int ammoStore = 0;
  private int maxAmmo;
  private int baseDamage;

  public Aircraft(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  public String getType() {
    return type;
  }

  public int fight() {
    int damage = ammoStore * baseDamage;
    ammoStore = 0;
    return damage;
  }

  public int refill(int ammo) {
    if (ammo > 0) {
      for (int i = ammo; i > 0; i--) {
        if (ammoStore < maxAmmo) {
          ammoStore++;
          ammo--;
        }
      }
      return ammo;
    }
    System.out.println("Not Enough Ammo!");
    return 0;
  }

  public String getStatus() {
    String status = getType() + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All damage: " + baseDamage * ammoStore;
    return status;
  }
}
