import java.util.Scanner;

public class tasks28to32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int i=1;
        while(i<=a) {
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            i++;
        }
        System.out.println();

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        System.out.println("Enter a number: ");
        int b = scanner.nextInt();
         i=0;
        int starcount = 1;
        int whitespace = b-1;
        while(i<b) {
            for(int j=0;j<whitespace;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < starcount ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
            starcount+=2;
            whitespace--;
            i++;
        }
        System.out.println();

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        System.out.println("Enter a number: ");
        int c = scanner.nextInt();

        if(c%2 ==0) {
            i = 0;
            starcount = 1;
            whitespace = c/2 - 1;
            while (i < c/2) {
                for (int j = 0; j < whitespace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starcount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starcount += 2;
                whitespace--;
                i++;
            }
            whitespace++;
            starcount-=2;
            while (i < c){
                for (int j = 0; j < whitespace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starcount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starcount -= 2;
                whitespace++;
                i++;
            }
            System.out.println();
        }else{
            i = 0;
            starcount = 1;
            whitespace = c/2;
            System.out.println(whitespace);
            while (i < c/2 +1) {
                for (int j = 0; j < whitespace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starcount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starcount += 2;
                whitespace--;
                i++;
            }
            whitespace+=2;
            starcount-=4;
            while (i < c){
                for (int j = 0; j < whitespace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starcount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starcount -= 2;
                whitespace++;
                i++;
            }
            System.out.println();
        }


        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was


        System.out.println("Enter a number: ");
        int d = scanner.nextInt();

        i = 0;
            for (int j = 0; j < d; j++) {
                System.out.print("%");
            }
            System.out.print("\n");
            for (int k = 0; k < d-2; k++) {
                System.out.print("%");
                for (int h = 0; h < d-2; h++) {
                    System.out.print(" ");
                }
                System.out.print("%\n");
            }
            for (int j = 0; j < d; j++) {
                System.out.print("%");
            }
            System.out.println();

        System.out.println();
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        System.out.println("Enter a number: ");
        int e = scanner.nextInt();

        i = 0;
        for (int j = 0; j < e; j++) {
            System.out.print("%");
        }
        int diagonalPos=0;
        System.out.print("\n");
        for (int k = 0; k < e-2; k++) {
            System.out.print("%");
            for (int h = 0; h < e-2; h++) {
                if(h==diagonalPos){
                    System.out.print("%");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("%\n");
            diagonalPos++;
        }
        for (int j = 0; j < e; j++) {
            System.out.print("%");
        }
        System.out.println();
        }
}

