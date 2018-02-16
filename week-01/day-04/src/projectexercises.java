import java.util.Scanner;
import java.util.Arrays;

public class projectexercises {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a word:");
        String s1 = scanner.nextLine();
        System.out.println("Enter an anagram:");
        String s2 = scanner.nextLine();

        System.out.println("Is it an anagram???");
        System.out.println(isAnagram(s1,s2));

        System.out.println();
        System.out.println("####Palindrome####");
        System.out.println("Enter a word:");
        String normalWord = scanner.nextLine();
        System.out.println(palindrome(normalWord));

        System.out.println();

        System.out.println("Write something in:");
        String line = scanner.nextLine();
        System.out.println(Arrays.toString(palindromeSearcher(line)));
    }

    public static boolean isAnagram(String input1, String input2){
        boolean anagram = false;

        if (input1.length()!=input2.length()){
            return false;
        }else {
            int i = 0;
            boolean sameChar;
            while (i<input1.length()){
                sameChar=false;
                for (int j = 0; j < input2.length(); j++) {
                    if (input1.charAt(i)==input2.charAt(j)){
                        sameChar=true;
                    }
                }
                if (sameChar == false){
                    anagram=false;
                    break;
                }
                i++;
                if (i==input1.length()){
                    anagram = true;
                }
            }
        }
      if (anagram==true){
            return true;
      }else{
            return false;
      }
    }

    public static String palindrome(String input){
        String word = input;

        for (int i = (input.length()-1); i >= 0; i--) {
            word+= input.charAt(i);
        }
        return word;
    }

    public static String[] palindromeSearcher(String input){
        String[] palindromeResults = new String[50];
        int charNumber = 3;
        int arrayIndex = 0;
        boolean possiblePalindrome;

        while (charNumber <= input.length()+1){
            for (int wordStart = 0; wordStart < input.length()-charNumber; wordStart++) {
                possiblePalindrome=true;
                int palindromeEnd = wordStart + charNumber - 1;
                for (int palindromeStart = wordStart; palindromeStart < wordStart + charNumber / 2 ; palindromeStart++) {
                    if (input.charAt(palindromeStart)!= input.charAt(palindromeEnd)){
                        possiblePalindrome = false;
                        break;
                    }
                        palindromeEnd--;
                }
                if (possiblePalindrome) {
                    palindromeEnd = wordStart + charNumber;
                    palindromeResults[arrayIndex] = input.substring(wordStart, palindromeEnd);
                    arrayIndex++;
                }
            }
            charNumber++;
        }
        return palindromeResults;
    }
}
