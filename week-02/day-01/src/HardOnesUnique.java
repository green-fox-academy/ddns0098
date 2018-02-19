import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class HardOnesUnique {
    public static void main (String[] args){
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`


    }

    public static String unique (int[] input){
        int[] temp = new int[1];
        temp[0]= input[0];
        boolean possiblyUnique;
        for (int i = 0; i < input.length; i++) {
            possiblyUnique = true;
            for (int j = 0; j < temp.length; j++) {
                if(input[i] == temp[j]){
                    possiblyUnique = false;
                    break;
                }
            }
            if (possiblyUnique){
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length-1] = input[i];
            }
        }

        return  Arrays.toString(temp);
    }
}
