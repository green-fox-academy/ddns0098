package pirates;

public class Main {
  public static void main(String[] args) {
    Pirate jack = new Pirate();
    Pirate mike = new Pirate();

    jack.brawl(mike);
    jack.howsItGoingMate();
    mike.howsItGoingMate();
    jack.parrot();
  }
}
