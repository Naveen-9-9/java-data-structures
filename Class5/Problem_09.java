public class Problem_09 {
    public static void main(String[] args) {
        try{
            try {
                int a =10,b = 5;
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error");
            }
        }
        finally{
            System.out.println("this is outer finally block");
        }
    }
}


