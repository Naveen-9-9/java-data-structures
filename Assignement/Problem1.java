import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N - 1];
        for (int i = 0; i < N - 1; i++) arr[i] = sc.nextInt();
        int sum = N * (N + 1) / 2;
        int sumArr = 0;
        for (int num : arr) sumArr += num;
        System.out.println(sum - sumArr);
    }
}
