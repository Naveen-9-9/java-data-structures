import java.util.Scanner;

public class min_col {
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
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int min = arr[0][i];

            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[j][i]) {
                    min = arr[j][i];
                }
            }
            System.out.println(min);
        }
    }
}
