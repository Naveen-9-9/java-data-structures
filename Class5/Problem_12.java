public class Problem_12 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (s == null) {
                throw new NullPointerException();
            }
            
        } catch (NullPointerException e) {
            System.out.println("error found : The String is empty");
        }
        System.out.println("program Ececuted in one piece");
    }
}

