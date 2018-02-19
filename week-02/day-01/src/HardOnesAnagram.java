import java.util.Scanner;

public class HardOnesAnagram {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        System.out.println("Enter an anagram:");
        String anagram = scanner.nextLine();

        System.out.println(isAnagram(word, anagram));
    }

    public static boolean isAnagram (String word, String possibleAnagram){
        boolean isAnagram;
        int rightCharCount = 0;

        if (word.length() != possibleAnagram.length()){
            return false;
        }

        for (int i = 0; i < possibleAnagram.length(); i++) {
            isAnagram = false;
            for (int j = 0; j < word.length(); j++) {
                if (possibleAnagram.charAt(i) == word.charAt(j)){
                    isAnagram = true;
                }
            }
            if (isAnagram){
                rightCharCount++;
            }
        }

        if (rightCharCount == possibleAnagram.length()){
            return true;
        }

        return false;
    }
}
