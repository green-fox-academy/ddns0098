package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  public List<Pirate> crew = new ArrayList<>();

  Random rand = new Random();

  public void fillShip() {
    for (int i = 0; i < rand.nextInt(10+1); i++) {
      crew.add(new Pirate());
      if (i == 0) {
        crew.get(i).setRank("Captain");
      }
    }
  }

  public int shipInfo() {
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      System.out.print(i+1 + ". ");
      if (i == 0) {
        System.out.print(crew.get(i).getDrank() + ", ");
      }
      System.out.print(crew.get(i).getRank() + ", ");
      String currentState = crew.get(i).getState();
      System.out.println(currentState + ", ");
      if (currentState.equals("Alive!")) {
        counter++;
      }
    }
    System.out.println(", Number of alive pirates: " + counter);
    return counter;
  }

  public boolean battle(Ship enemyShip) {
    int score = 0;
    int enemyScore = 0;

    for (int i = 0; i < crew.size(); i++) {
      score += shipInfo();
      score -= crew.get(0).getDrank();

      enemyScore += enemyShip.shipInfo();
      enemyScore -= enemyShip.crew.get(0).getDrank();
    }

    if (score > enemyScore) {
      for (int i = 0; i < rand.nextInt(enemyShip.crew.size()) + 1; i++) {
        enemyShip.crew.remove(i);
      }
      return true;
    }
    for (int i = 0; i < rand.nextInt(crew.size()) + 1; i++) {
      crew.remove(i);
    }
    return false;
  }
}
