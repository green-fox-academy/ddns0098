import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Poker {
  public static void main(String[] args) {

  }

  public Card getHighCard(List<Card> deckOne, List<Card> deckTwo) {
    deckOne.sort(Comparator.comparing(Card::getValue));
    deckTwo.sort(Comparator.comparing(Card::getValue));

    if (deckOne.get(4).getValue() > deckTwo.get(4).getValue()) {
      System.out.println("Black wins! - (High Card: " + convertValueToString(deckOne.get(4).getValue()) + ")");
      return deckOne.get(4);
    }
    System.out.println("White wins! - (High Card: " + convertValueToString(deckTwo.get(4).getValue()) + ")");
    return deckTwo.get(4);
  }

  public Object getPairs(List<Card> deckOne, List<Card> deckTwo) {
    Map<Object,Long> deckOneMap = deckOne.stream()
            .collect(Collectors.groupingBy(Card::getValue,
                    Collectors.counting()));

    Map<Object,Long> deckTwoMap = deckTwo.stream()
            .collect(Collectors.groupingBy(Card::getValue,
                    Collectors.counting()));

    List<Object> deckOnePairs = deckOneMap.entrySet().stream()
            .filter(o -> o.getValue() == 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    List<Object> deckTwoPairs = deckTwoMap.entrySet().stream()
            .filter(o -> o.getValue() == 2)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    if ((int)deckOnePairs.get(0) > (int)deckTwoPairs.get(0)) {
      String resultBlack = convertValueToString((int)deckOnePairs.get(0));
      System.out.println("Black wins! - (Pair: " + resultBlack + ")");
      return resultBlack;
    }
    String resultWhite = convertValueToString((int)deckTwoPairs.get(0));
    System.out.println("White wins! - (Pair: " + resultWhite + ")");
    return resultWhite;
  }

  public String convertValueToString(int value) {
    if (value == 11) {
      return "J";
    } else if (value == 12) {
      return "Q";
    } else if (value == 13) {
      return "K";
    } else if (value == 14) {
      return "A";
    }
    return String.valueOf(value);
  }
}
