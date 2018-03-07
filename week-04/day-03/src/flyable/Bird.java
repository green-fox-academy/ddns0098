package flyable;

import animals.Animal;

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return null;
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }
}
