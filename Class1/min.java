import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter rows &cols : ");
        int[][] arr = new int[Sc.nextInt()][Sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        int Min = arr[0][0];

        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr[i].length; j++) {
                if (Min > arr[i][j]) {
                    Min = arr[i][j]; 
                }

            }
        System.out.println(Min);
    }
}
