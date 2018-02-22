import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        checksIfArmostrong(number);
    }

    private static void checksIfArmostrong(int number) {
        int sum = 0;
        String numberString =  Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numberString.charAt(i)),numberString.length());
        }
        if (sum == number) {
            System.out.println("The " + number + " is an Armstrong number.");
            return;
        }
        System.out.println("The " + number + " is NOT an Armstrong number.");
    }


}
