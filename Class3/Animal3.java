class Animal2 {
    void sleep(){
        System.out.println("This will sleep later🤑");
    }
    void drink(){
        System.out.println("This animal will drink on 31 night ");
    }
}

class Cat extends Animal2{
    void CAT(){
        System.out.println("This is Cat");
    }
}
class Kitten extends Cat{
    void KITTEN(){
        System.out.println("This is Kitten");
    }
}
public class Animal3 {
    public static void main(String[] args) {
        Kitten k1 = new Kitten();
        Cat c1 = new Cat();

        k1.KITTEN();
        k1.drink();
        k1.sleep();
        c1.CAT();
    }
}
