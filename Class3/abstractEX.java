abstract class Vechile {
    abstract void start();
}

class Bike extends Vechile {
    void start(){
        System.out.println("Bike Starts with Bike Key");
    }
}

public class abstractEX {

    public static void main(String[] args) {
        Vechile v = new Bike();
        v.start();
    }
}
 