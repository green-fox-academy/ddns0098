public class Animal {
  private int hunger = 50;
  private int thirst = 50;

  public void eat(){
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.play();
    dog.drink();
    dog.drink();
    System.out.println(dog.getHunger());
    System.out.println(dog.getThirst());
  }
}
