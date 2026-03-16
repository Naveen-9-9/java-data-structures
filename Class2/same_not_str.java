import java.util.Scanner;

public class same_not_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        if (str.length() != str2.length()) {
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                System.out.println("not equal");
                return;
            }
        }

        System.out.println("equal");
    }
}
