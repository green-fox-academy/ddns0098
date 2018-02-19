import java.util.Arrays;

public class HardOnesSortThatList {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String bubble (int[] input){
        for (int j = 0; j < input.length - 1; j++) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i + 1];
                    input[i + 1] = input[i];
                    input[i] = temp;
                }
            }
        }
        return  Arrays.toString(input);
    }

    public static String advancedBubble (int[] input, boolean descend){
        if (descend) {
            for (int j = 0; j < input.length - 1; j++) {
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i] < input[i + 1]) {
                        int temp = input[i + 1];
                        input[i + 1] = input[i];
                        input[i] = temp;
                    }
                }
            }
        }
        return  Arrays.toString(input);
    }
}
