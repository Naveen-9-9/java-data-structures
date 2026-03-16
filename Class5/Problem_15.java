public class Problem_15 {
    public static void main(String[] args) {
        String s = "abc";
        try {
            if (s == null) {
                throw new NullPointerException();
            }
            if(s == ""){
                throw new IllegalArgumentException();
            }
            else{
            System.out.println("s is : "+s);
            }
        } 
        catch (NullPointerException e) {
            System.out.println("the string value is null");
        }
        catch(IllegalArgumentException e){
            System.out.println("the string value is empty");
        }
        }
    }

