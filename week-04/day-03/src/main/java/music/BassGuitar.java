package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    numberOfStrings = 4;
  }

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }
}
