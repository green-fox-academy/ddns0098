import java.util.Scanner;

public class hardone {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        //System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `17`

        //System.out.println(subStr("this is what I'm searching in", "not"));
        //  should print: `-1`
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what do you search in:");
        String elso = scanner.nextLine();
        System.out.println("Enter what do you serach:");
        String masodik = scanner.nextLine();

        int number = subStr(elso,masodik);

        System.out.println(elso + "( This is what I search in, " + masodik +" (and this is what I search for)");
        System.out.println(number);
    }

    public static int subStr(String input, String q) {
        int pos = 0;
        pos = input.toLowerCase().indexOf(q.toLowerCase());

        if(pos != 0){
            return  pos;
        }else {
            return -1;
        }
    }
}
