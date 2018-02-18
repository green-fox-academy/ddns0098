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
        int number1 = scanner.nextInt();
        int i=0;
        while (i <= number1) {
            for (int j=0; j < i; j++) {
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
        int number2 = scanner.nextInt();
         i=0;
        int starCount = 1;
        int whiteSpace = number2 - 1;
        while (i < number2) {
            for (int j=0;j<whiteSpace;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < starCount ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
            starCount+=2;
            whiteSpace--;
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
        int number3 = scanner.nextInt();

        if (number3 % 2 == 0) {
            i = 0;
            starCount = 1;
            whiteSpace = number3 / 2 - 1;
            while (i < number3 / 2) {
                for (int j = 0; j < whiteSpace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starCount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starCount += 2;
                whiteSpace--;
                i++;
            }
            whiteSpace++;
            starCount-=2;
            while (i < number3){
                for (int j = 0; j < whiteSpace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starCount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starCount -= 2;
                whiteSpace++;
                i++;
            }
            System.out.println();
        }else{
            i = 0;
            starCount = 1;
            whiteSpace = number3 / 2;
            System.out.println(whiteSpace);
            while (i < number3 / 2 + 1) {
                for (int j = 0; j < whiteSpace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starCount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starCount += 2;
                whiteSpace--;
                i++;
            }
            whiteSpace+=2;
            starCount-=4;
            while (i < number3){
                for (int j = 0; j < whiteSpace; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < starCount; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                starCount -= 2;
                whiteSpace++;
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
        int number4 = scanner.nextInt();

        i = 0;
            for (int j = 0; j < number4; j++) {
                System.out.print("%");
            }
            System.out.print("\n");
            for (int k = 0; k < number4 - 2; k++) {
                System.out.print("%");
                for (int h = 0; h < number4 - 2; h++) {
                    System.out.print(" ");
                }
                System.out.print("%\n");
            }
            for (int j = 0; j < number4; j++) {
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
        int number5 = scanner.nextInt();

        i = 0;
        for (int j = 0; j < number5; j++) {
            System.out.print("%");
        }
        int diagonalPos=0;
        System.out.print("\n");
        for (int k = 0; k < number5 - 2; k++) {
            System.out.print("%");
            for (int h = 0; h < number5 - 2; h++) {
                if (h == diagonalPos){
                    System.out.print("%");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("%\n");
            diagonalPos++;
        }
        for (int j = 0; j < number5; j++) {
            System.out.print("%");
        }
        System.out.println();
        }
}

