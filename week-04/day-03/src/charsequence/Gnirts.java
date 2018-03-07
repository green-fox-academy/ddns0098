package charsequence;

public class Gnirts implements CharSequence {
  private String str;

  public Gnirts(String str) {
    this.str = str;
  }


  @Override
  public int length() {
    return str.toCharArray().length;
  }

  @Override
  public char charAt(int index) {
    return str.toCharArray()[str.length()-1-index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String temp = "";
    for (int i = start; i < end; i++) {
      temp += str.toCharArray()[str.toCharArray().length-1-i];
    }
    return temp;
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));

    System.out.println(g.subSequence(1,4));
  }
}
