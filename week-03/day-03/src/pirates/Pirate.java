package pirates;

import java.util.Random;

public class Pirate {
  private String rank = "Pirate";
  private int drank = 0;
  private boolean isDead;
  private String state = "Alive";

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public String getRank() {
    return rank;
  }

  public int drinkSomeRum() {
    return drank++;
  }

  public int getDrank() {
    return drank;
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println("He's dead.");
    } else if (drank >= 0 && drank <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      System.out.println("*The pirate passed out and slept it off...*");
      drank = 0;
    }
  }

  public void die(){
    isDead = true;
  }

  public void stateChanger() {
    if (isDead) {
      state = "Dead!";
    } else if (drank > 4) {
      state = "Passed out...";
    } else {
      state = "Alive!";
    }
  }

  public void brawl(Pirate enemy) {
    Random rand = new Random();
    int number = rand.nextInt(3)+1;
    if (number == 1) {
      die();
      System.out.println("You died...");
    } else if (number == 2) {
      enemy.die();
      System.out.println("The enemy died...");
    } else {
      System.out.println("*Both pirates passed out*");
    }
  }

  public void parrot() {
    if (isDead) {
      System.out.println("He's dead.");
    } else {
      System.out.println("You've got yourself a nice little parrot...");
    }
  }
}
