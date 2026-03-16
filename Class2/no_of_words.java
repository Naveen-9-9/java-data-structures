 import java.util.Scanner;

public class no_of_words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0 ;
        int word = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && word == 0) {
                word = 1;
                count += 1;
            }else if (ch == ' '){
                word = 0;
            }
        }
        System.out.println(count);
    }
}
