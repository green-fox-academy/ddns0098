import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerTest {

  @Test
  public void pokerTest() {
    //Arrange
    Poker poker = new Poker();

    List<Card> deckOne = new ArrayList<>(Arrays.asList(
            new Card("2", "H"),
            new Card("5", "D"),
            new Card("5", "S"),
            new Card("9", "C"),
            new Card("K", "D")
    ));

    List<Card> deckTwo = new ArrayList<>(Arrays.asList(
            new Card("2", "C"),
            new Card("3", "H"),
            new Card("4", "S"),
            new Card("A", "C"),
            new Card("A", "H")
    ));

    //Act
    Card resultOfHighCard = poker.getHighCard(deckOne, deckTwo);
    Object resultOfPairs = poker.getPairs(deckOne, deckTwo);

    //Assert
    assertEquals(deckTwo.get(4), resultOfHighCard);
    assertEquals("A", resultOfPairs);
  }

}