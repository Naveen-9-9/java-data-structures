import java.util.Scanner;

public class class_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Shashi";
        String str2 = "Bunny";
        System.out.println(str.charAt(3));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str.charAt(3));
    }
}
