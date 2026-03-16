public class Problem_03 {
    public static void main(String[] args) {
        try{
            int arr[] = {10,20,30,40};
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Array index out of range");
        }
        System.out.println("Program terminated normally");
    }
    
}
