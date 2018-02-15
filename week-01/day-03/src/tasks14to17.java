import java.util.Scanner;

public class tasks14to17 {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Hello, " + user);
        System.out.println();

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        int km = scanner.nextInt();
        System.out.println(km*0.621 + " miles");
        System.out.println();

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*2 + b*4);
        System.out.println();

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        double osszeg=0;
        for (int i = 0; i < 5; i++) {
            int szam = scanner.nextInt();
            osszeg+=szam;

        }
        System.out.println("Sum: " + osszeg + ", Average: " + (double)(osszeg/5));
    }
}
