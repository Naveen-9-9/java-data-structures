public class Problem_14 {
    public static void main(String[] args) {
        int a = 124;
        try {
            if (a < 0) {
                throw new ArithmeticException();
            }
            if (a == 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("a : " + a);
            }
        } catch (ArithmeticException e) {
            System.out.println("The value is Negative");
        } catch (IllegalArgumentException e) {
            System.out.println("the value is Zero");
        }
    }
}