package reservations;

import java.util.Random;

public class Reservation implements Reservationy{

  Random rand = new Random();

  @Override
  public String getDowBooking() {
    String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return DOW[rand.nextInt(7)];
  }

  @Override
  public String getCodeBooking() {
    String temp = "";
    for (int i = 0; i < 8; i++) {
      if(rand.nextInt(2)+1 == 1) {
        char c = (char)(rand.nextInt(26) + 65);
        temp += c;
      } else {
        char c = (char)(rand.nextInt(10) + 48);
        temp += c;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    Reservation reservation = new Reservation();
    for (int i = 0; i < 8; i++) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}
