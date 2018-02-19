import java.util.Scanner;
import java.util.Arrays;

public class HardOnesPalindromeSearcher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        String line = scanner.nextLine();

        System.out.println(searchPalindrome(line));
    }

    public static String searchPalindrome (String input){
        String[] temp = new String[0];
        boolean possiblePalindrome;

        for (int charCount = 2; charCount < input.length(); charCount++) {
            for (int i = 0; i < input.length() - charCount; i++) {
                possiblePalindrome = true;
                for (int start = i; start < (i + charCount / 2); start++) {
                    for (int end = (i + charCount); end > (i + charCount / 2); end--) {
                        if (input.charAt(start) != input.charAt(end)){
                            possiblePalindrome = false;
                            break;
                        }
                    }
                }

                if (possiblePalindrome){
                    temp = Arrays.copyOf(temp, temp.length + 1);
                    temp[temp.length-1] = input.substring(i, (i+charCount+1));
                }
            }
        }
        return Arrays.toString(temp);
    }
}
