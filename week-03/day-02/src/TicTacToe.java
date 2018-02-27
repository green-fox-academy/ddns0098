import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  private static String ticTacResult(String s) {
    Path path = Paths.get(s);

    try {
      List<String> game = Files.readAllLines(path);
      if (!checkRowsAndColumns(game).equals("")) {
        return checkRowsAndColumns(game);
      }
      if (!checkDiagonals(game).equals("")) {
        return checkDiagonals(game);
      }
    } catch(IOException e){
        e.printStackTrace();
      }
      return "draw";
  }

  private static String checkDiagonals(List<String> game) {
    int counterX = 0;
    int counterO = 0;
    int j = 0;
    for (int i = 0; i < 3; i++) {
        //check diagonals
        if (game.get(i).charAt(j) == 'X') {
          counterX++;
        } else if (game.get(i).charAt(j) == 'O') {
          counterO++;
        }
        j++;
      }

    if (counterX == 3) {
      return "X";
    } else if (counterO == 3) {
      return "O";
    }

    counterX = 0;
    counterO = 0;

    j = 0;
    for (int i = 2; i >= 0; i--) {
        //check diagonals
        if (game.get(i).charAt(j) == 'X') {
          counterX++;
        } else if (game.get(i).charAt(j) == 'O') {
          counterO++;
        }
      j++;
    }

    if (counterX == 3) {
      return "X";
    } else if (counterO == 3) {
      return "O";
    }
    return "";
  }

  private static String checkRowsAndColumns(List<String> game) {
    int counterX = 0;
    int counterO = 0;

    for (int k = 0; k < 2; k++) {
      for (int i = 0; i < game.size(); i++) {
        counterX = 0;
        counterO = 0;
        for (int j = 0; j < 3; j++) {
          //check rows
          if (k == 0 && game.get(i).charAt(j) == 'X') {
            counterX++;
          } else if (k == 0 && game.get(i).charAt(j) == 'O') {
            counterO++;
          }
          //check columns
          if (k == 1 && game.get(j).charAt(i) == 'X') {
            counterX++;
          } else if (k == 1 && game.get(j).charAt(i) == 'O') {
            counterO++;
          }
        }
        if (counterX == 3) {
          return "X";
        } else if (counterO == 3) {
          return "O";
        }
      }
    }
    return "";
  }
}