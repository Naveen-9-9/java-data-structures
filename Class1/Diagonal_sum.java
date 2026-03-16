import java.util.Scanner;

public class Diagonal_sum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter rows & cols : ");
        int rows = Sc.nextInt();
        int cols = Sc.nextInt();
        
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int DiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            DiagonalSum += arr[i][i];
        }
        System.out.println("Diagonal Sum: " + DiagonalSum);
        System.out.println(arr.length);
    }
}
