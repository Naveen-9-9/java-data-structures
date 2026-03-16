public class Problem_07 {
    public static void main(String[] args) {
        int arr[] = {1,2};
        try{
            System.out.println(arr[3]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e ){
            System.out.println("Exception handled");
        }
    }
}
