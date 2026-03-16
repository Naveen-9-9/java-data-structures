import java.util.Scanner;

public class C4_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  arr = {1,2,3,4,5};
        int b = sc.nextInt();

        try {
            System.out.println(arr[3]/b);
            throw new ArithmeticException("Throw exception");
        }
        catch (ArithmeticException e){
            System.out.println("error found : " + e );
            System.out.println("enter a new value ");
            
            b = sc.nextInt();
            System.out.println(arr[3]/b);
        }
}
}