package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar() {
    numberOfStrings = 6;
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
