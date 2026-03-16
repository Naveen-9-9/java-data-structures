import java.util.Scanner;

public class febonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + number);
    }
    
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
