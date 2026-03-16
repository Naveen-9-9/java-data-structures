interface Appliance{
    abstract void turnOn();
    abstract void turnOff();
}

class fan implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("fan On");
    }
    @Override
    public void turnOff() {
        System.out.println("fan Off");
    }
}
public class Problem02 {

    public static void main(String[] args) {
        fan cr = new fan();
        cr.turnOn();
        cr.turnOff();
    }
}