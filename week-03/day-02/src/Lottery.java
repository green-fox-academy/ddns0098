import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    int[] numbers = commonLotteryNumbers();
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }

  private static int[] commonLotteryNumbers() {
    Path path = Paths.get("lottery.csv");
    int[][] numbers = new int[90][2];
    for (int i = 0; i < 90; i++) {
      numbers[i][0] = i+1;
      numbers[i][1] = 0;
    }
    try {
      List<String> lines = Files.readAllLines(path);
      for (int i = 0; i < lines.size(); i++) {
        String[] singleLine = lines.get(i).split(";");
        for (int j = 0; j < 5; j++) {
          for (int k = 0; k < 90; k++) {
            if (Integer.parseInt(singleLine[11+j]) == numbers[k][0]) {
              numbers[k][1]++;
            }
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sortNumbers(numbers);
  }

  private static int[] sortNumbers(int[][] numbers) {
    for (int i = 0; i < 90; i++) {
      for (int j = 0; j < 89; j++) {
        if (numbers[j][1] < numbers[j+1][1]) {
          int temp = numbers[j][0];
          numbers[j][0] = numbers[j+1][0];
          numbers[j+1][0] = temp;

          int tempCount = numbers[j][1];
          numbers[j][1] = numbers[j+1][1];
          numbers[j+1][1] = tempCount;
        }
      }
    }
    int[] commonNumbers = new int[5];
    for (int i = 0; i < 5; i++) {
      commonNumbers[i] = numbers[i][0];
      //System.out.println(numbers[i][1]);
    }
    return commonNumbers;
  }
}