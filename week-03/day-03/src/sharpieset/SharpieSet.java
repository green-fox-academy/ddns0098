package sharpieset;

import dominoes.Domino;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  public static int countUsable() {
    int count = 0;
    for (int i = 0; i < sharpieList().size(); i++) {
      if (sharpieList().get(i).getInkAmount() > 0) {
        count++;
      }
    }
    return count;
  }

  public static void removeTrash() {
    for (int i = 0; i < sharpieList().size(); i++) {
      if (!(sharpieList().get(i).getInkAmount() > 0)) {
        sharpieList().remove(i);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(SharpieSet.countUsable());
    SharpieSet.removeTrash();
  }


  static List<Sharpie> sharpieList() {
    List<sharpieset.Sharpie> sharpies = new ArrayList<>();
    sharpies.add(new sharpieset.Sharpie("blue",2));
    sharpies.add(new sharpieset.Sharpie("green",1.2));
    sharpies.add(new sharpieset.Sharpie("pink",5.6));
    sharpies.add(new sharpieset.Sharpie("purple",3));
    sharpies.add(new sharpieset.Sharpie("blue",4));
    return sharpies;
  }
}
