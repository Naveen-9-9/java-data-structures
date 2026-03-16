public class Problem_08 {
    public static void main(String[] args) {
        int arr[] = {1,2};
        try{
            System.out.println(arr[3]);
            try {
                int a =10,b = 0;
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch : Array error");
        }
    }
}

