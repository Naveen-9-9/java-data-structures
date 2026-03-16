import java.util.Scanner;

public class no_of_occ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char str2 = sc.next().charAt(0);
        int count = 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (str2 == str.charAt(i) ){    
                count += 1;
            }
        }
        System.out.println("Count + " + count);
    }
} 

