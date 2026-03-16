 import java.util.Scanner;

public class no_of_space{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = ' ';
        int count = 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
