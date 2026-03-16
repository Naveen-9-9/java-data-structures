class smaple{
    private int a = 10 ;
    protected int b = 20;
    int c = 30;
    public int d = 40;
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class specifiers {

    public static void main(String[] args) {
        smaple s = new smaple();
        // System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(s.c);
        System.out.println(s.d);
    }
}
