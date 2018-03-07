package charsequence;

public class Shifter implements CharSequence {
  private String str;
  private int shift;

  public Shifter(String str, int shift) {
    this.str = str;
    this.shift = shift;
  }

  @Override
  public int length() {
    return str.toCharArray().length;
  }

  @Override
  public char charAt(int index) {
    String strPlus = str + str;
    return strPlus.toCharArray()[index+shift];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String strPlus = str + str;
    String temp = "";
    for (int i = start; i < end; i++) {
      temp += strPlus.toCharArray()[i + 2];
    }
    return temp;
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));

    System.out.println(s.subSequence(1,4));
  }
}
