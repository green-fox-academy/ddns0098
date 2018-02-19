import java.util.Scanner;

public class HardOnesPalindromeBuilder {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        System.out.println(createPalindrome(word));
    }

    public static String createPalindrome (String word){
        for (int i = word.length()-1; i >=0 ; i--) {
            word += word.charAt(i);
        }
        return word;
    }
}
