public class Problem_02 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("String is Null");
        }
        System.out.println("program terminated normally");
    }
}
