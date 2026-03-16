import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == -999) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}