public class tasks7to10 {
    public static void main(String[] args) {
        int favorite_number = 8;
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
        System.out.println("My favorite number is: " + favorite_number);
        System.out.println();
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        int x = a;
        a = b;
        b = x;
        System.out.println(a);
        System.out.println(b);

        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println();
        // Print the Body mass index (BMI) based on these values
        System.out.println("BMI= " + massInKg/(heightInM*heightInM));
        System.out.println();

        // Define several things as a variable then print their values
        // Your name as a string
        String name="Dinók Dénes";
        // Your age as an integer
        int age=19;
        // Your height in meters as a double
        double height = 1.84;
        // Whether you are married or not as a boolean
        boolean isMarried = false;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(isMarried);
        System.out.println();

        
    }
}
