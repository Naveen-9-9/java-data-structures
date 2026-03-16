class Vechile {
    void Speed(){
        System.out.println("Normal vechile");
    }

}
class Car extends Vechile{
    
    void Speed(){
        System.out.println("car speed is 250 km/h");
    }

}

public class Overiding {
    public static void main(String[] args) {
        Car a = new Car();

        a.Speed();
    }
}




