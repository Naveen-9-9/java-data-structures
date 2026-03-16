public class Problem_05 {
    public static void main(String[] args) {
        int a = 10 , b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        finally{

            System.out.println("Program Ended");
        }    
    }
}
