import java.util.Scanner;

public class max_col {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter rows &cols : ");
        int rows = Sc.nextInt();
        int cols = Sc.nextInt();
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        System.out.println("The array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Find min and max of each column
        for (int j = 0; j < cols; j++) {
            int max = arr[0][j];
            int min = arr[0][j];

            for (int i = 1; i < rows; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("Column " + j + " Maximum is: " + max);
            System.out.println("Column " + j + " Minimum is: " + min);
        }
    }
}

