import java.util.Scanner;

public class class_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length()-1) {
                System.out.println(str.charAt(i));
            }
            else{
                System.out.print(str.charAt(i)+"-");
            }
        }
    }
}
