import java.util.Scanner;

public class projectexercises {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a word:");
        String s1 = scanner.nextLine();
        System.out.println("Enter an anagram:");
        String s2 = scanner.nextLine();

        System.out.println("Is it an anagram???");
        System.out.println(isAnagram(s1,s2));


    }

    public static boolean isAnagram(String input1, String input2){
        boolean anagram = false;

        if(input1.length()!=input2.length()){
            return false;
        }else {
            int i = 0;
            boolean sameChar;
            while(i<input1.length()){
                sameChar=false;
                for (int j = 0; j < input2.length(); j++) {
                    if(input1.charAt(i)==input2.charAt(j)){
                        sameChar=true;
                    }
                }
                if(sameChar == false){
                    anagram=false;
                    break;
                }
                i++;
                if(i==input1.length()){
                    anagram = true;
                }
            }
        }
      if(anagram==true){
            return true;
      }else{
            return false;
      }
    }
}
