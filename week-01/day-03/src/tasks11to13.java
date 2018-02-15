import java.util.Scanner;

public class tasks11to13 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a +=10;

        System.out.println(a);




        int b = 100;
        // make it smaller by 7
        b-=7;

        System.out.println(b);




        int c = 44;
        // please double c's value
        c*=2;

        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d /= 5 ;

        System.out.println(d);




        int e = 8;
        // please cube of e's value
        e *= e*e;

        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        System.out.println(f1>f2);



        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println(g2*2 > g1);



        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        if(h % 11 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        if(i1 > i2*i2 && i1 < i2*i2*i2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        if(j % 3 == 0 || j % 5 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        for(int i=0;i < 4;i++){
            k+=k;
        }

        System.out.println(k);
        System.out.println();

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double s1,s2,s3;
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();

        double surface= 2*(s1*s2+s2*s3+s3*s1);
        double volume= s1*s2*s3;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
        System.out.println();

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int secondsLeft = (24-currentHours)*120+(60-currentMinutes)*60+60-currentSeconds;
        System.out.println(secondsLeft);
    }
}
