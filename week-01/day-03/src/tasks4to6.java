public class tasks4to6 {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        String name="Dinók Dénes";
        int age=19;
        float height = 1.84f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22; int b = 13;
        // Print the result of 13 added to 22
        System.out.println(a+b);
        // Print the result of 13 substracted from 22
        System.out.println(a-b);
        // Print the result of 22 multiplied by 13
        System.out.println(a*b);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        double c = a / b;
        System.out.println(c);
        // Print the integer part of 22 divided by 13
        System.out.println(a / b);
        // Print the reminder of 22 divided by 13
        System.out.println(a%b);

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println(17*5*6);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double kodora = 17*7*6;
        double munkaora = 17*52;
        double szazalek = kodora/munkaora * 100;
        System.out.println((int)szazalek + "%");
    }
}
