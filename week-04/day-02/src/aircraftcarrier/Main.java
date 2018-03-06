package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Carrier carrier = new Carrier(2000, 100);
    carrier.addAircraft("F16");
    carrier.addAircraft("F35");
    carrier.addAircraft("f2");
    carrier.addAircraft("F16");
    carrier.addAircraft("F16");
    carrier.addAircraft("F35");
    carrier.addAircraft("F35");
    carrier.fill();
    carrier.getStatus();
  }
}
