public class Problem_10 {
    public static void main(String[] args) {
        String  s = "abc";
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
            System.out.println(50/num);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program normally executed");
    }
}

