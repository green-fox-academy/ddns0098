package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {
  }

  @Override
  public void play() {
    System.out.print(this.getClass().getSimpleName() + ", a " + numberOfStrings + "-stringed instrument that goes ");
    sound();
  }

  public abstract void  sound();
}
