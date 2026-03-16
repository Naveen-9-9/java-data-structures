
class Multiplication{
    int MUL(int a , int b) {
        return a * b;
    }
    int MUL(int a , int b, int c) {
        return a * b * c;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Multiplication a = new Multiplication();
        System.out.println(a.MUL(12,30));
        System.out.println(a.MUL(12,30,50));
    }
}
