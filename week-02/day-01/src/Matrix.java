import java.util.Scanner;


public class Matrix {
    public static void main (String[] args){
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j){
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
