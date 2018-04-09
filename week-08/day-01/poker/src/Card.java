public class Card {
  private int value;
  private String color;

  public Card( String value, String color) {
    this.value = convertValueToInt(value);
    this.color = color;
  }

  public int getValue() {
    return value;
  }

  public String getColor() {
    return color;
  }

  public int convertValueToInt(String strValue) {
    if ("J".equals(strValue)) {
      return 11;
    } else if ("Q".equals(strValue)) {
      return  12;
    } else if ("K".equals(strValue)) {
      return  13;
    } else if ("A".equals(strValue)) {
      return  14;
    } else {
      return Integer.parseInt(strValue);
    }
  }
}
