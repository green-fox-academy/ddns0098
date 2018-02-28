package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<dominoes.Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = i; j < dominoes.size()-1; j++) {
        if (dominoes.get(i).getValues()[1] ==  dominoes.get(j+1).getValues()[0]) {
          dominoes.add(i+1, dominoes.get(j+1));
          dominoes.remove(j+2);
        }
      }
    }

    System.out.println(dominoes);
  }

  static List<dominoes.Domino> initializeDominoes() {
    List<dominoes.Domino> dominoes = new ArrayList<>();
    dominoes.add(new dominoes.Domino(5, 2));
    dominoes.add(new dominoes.Domino(4, 6));
    dominoes.add(new dominoes.Domino(1, 5));
    dominoes.add(new dominoes.Domino(6, 7));
    dominoes.add(new dominoes.Domino(2, 4));
    dominoes.add(new dominoes.Domino(7, 1));
    return dominoes;
  }
}