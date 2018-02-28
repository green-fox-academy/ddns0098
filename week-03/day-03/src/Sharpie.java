public class Sharpie {
  private String color;
  private double width;
  private double inkAmount = 100;

  public void use() {
    inkAmount--;
  }

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("green", 3.5);

    for (int i = 0; i < 10; i++) {
      sharpie1.use();
    }

    System.out.println(sharpie1.getInkAmount());
  }
}
