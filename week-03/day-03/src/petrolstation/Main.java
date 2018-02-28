package petrolstation;

public class Main {
  public static void main(String[] args) {
    Car jeep = new Car(0, 100);
    Station omw = new Station();

    omw.refill(jeep);

    System.out.println(omw.getGasAmount());
    System.out.println(jeep.getGasAmount());
  }
}
