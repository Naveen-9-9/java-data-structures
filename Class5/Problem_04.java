public class Problem_04 {
    public static void main(String[] args) {
        String s = "123a";
        try{
            int number = Integer.parseInt(s);
            System.out.println(number);
        }
        catch(NumberFormatException e ){
            System.out.println("Invalid number format");
        }
        System.out.println("program terminated in one piece");
    }
}
