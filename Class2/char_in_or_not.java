import java.util.Scanner;

public class char_in_or_not{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char str2 = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str2 == str.charAt(i) ){    
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
} 

