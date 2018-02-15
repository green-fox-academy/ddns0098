import java.util.Scanner;

public class tasks21to22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        System.out.println("Enter the number of girls: ");
        int girls = scanner.nextInt();
        System.out.println("Enter the number of boys: ");
        int boys = scanner.nextInt();

        if(girls == 0){
            System.out.println("Sausage party");
        }else if(girls+boys < 20){
            System.out.println("Average party...");
        }
        else if(girls == boys && girls+boys>20){
            System.out.println("The party is excellent!");
        }else if(girls+boys > 20 && girls != boys) {
            System.out.println("Quite cool party!");
        }

        System.out.println();


        //Next task
        double a = 24;
        int out = 0;
        // if a is even increment out by one
        if(a%2 == 0){
            out++;
        }

        System.out.println(out);




        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if(b >= 10 && b <= 20){
            out2="Sweet!";
        }else if(b < 10){
            out2="Less!";
        }else{
            out2="More!";
        }

        System.out.println(out2);



        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if(credits >= 50 && isBonus == false){
            c-=2;
        }else if(credits < 50 && isBonus == false){
            c--;
        }

        System.out.println(c);




        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        if(d % 4 == 0 && time <=200){
            out3="check";
        }else if(d % 4 == 0 && time >200){
            out3="Time out";
        }else{
            out3="Run Forest Run";
        }

        System.out.println(out3);



    }
}
