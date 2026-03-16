import java.util.Scanner;

public class max_of_each_row {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter rows &cols : ");
        int[][] arr = new int[Sc.nextInt()][Sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int Max = arr[i][0];

            for (int j = 0; j < arr[i].length; j++) {
                if (Max < arr[i][j]) {
                    Max = arr[i][j];
                }
            }
            System.out.println(Max);
        }
    }
}
