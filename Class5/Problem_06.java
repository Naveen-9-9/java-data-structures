public class Problem_06 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        try {
            System.out.println(arr[3]);
            System.out.println(arr[2] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        } catch (ArithmeticException i) {
            System.out.println("Arithmetic error");
        }
        System.out.println("Program terminated normally");
    }

}
