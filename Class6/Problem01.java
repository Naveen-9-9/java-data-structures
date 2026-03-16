interface Shape{
    abstract void draw();
}

class Cirlce implements Shape{
    @Override
    public void draw() {
        System.out.println("this is Interface Drawing");
    }
}
public class Problem01 {

    public static void main(String[] args) {
        Cirlce cr = new Cirlce();
        cr.draw();
    }
}