import java.util.Scanner;

public class C4_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  arr = {1,2,3,4,5};
        int b = sc.nextInt();

        try {
            System.out.println(arr[3]/b);
        }
        catch (ArithmeticException e){
            System.out.println("error found : " + e );
            System.out.println("enter a new value ");
            
            b = sc.nextInt();
            System.out.println(arr[3]/b);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(" error found : " + e);
        }

        finally {
            System.out.println(" Idc About anything i will execute anyway.. !");
        }
    }
}
