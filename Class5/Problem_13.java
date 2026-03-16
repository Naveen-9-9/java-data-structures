public class Problem_13 {
    public static void main(String[] args) {
    int[] arr = new int[5];
    
    try {
        arr[6] = 12;
        System.out.println(arr[6]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("The index cannot be access ");
    }
    }
    
}
