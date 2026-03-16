public class Problem_11 {
 public static void main(String[] args) {
    int a = 0;

    try {
        if (a == 0) {
            throw new ArithmeticException();
        }
        
    } catch (ArithmeticException e) {
        System.out.println("error found");
    }
    System.out.println(a);
 }   
}
