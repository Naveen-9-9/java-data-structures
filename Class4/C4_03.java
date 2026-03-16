public class C4_03 {

    public static void Calculate(int a , int b) throws ArithmeticException {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        try {
            Calculate(34,21);
        }
        catch (ArithmeticException e){
           System.out.println("error found");
        }
}
}
