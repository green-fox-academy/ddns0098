import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        //ArrayList<Integer> arrayList = (ArrayList)Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
        System.out.println(containsSeven(arrayList));
    }

    public static String containsSeven(ArrayList arrayList){
        if (arrayList.contains(7)){
            return "Hoorray";
        }
        return "Noooooo";
    }
}