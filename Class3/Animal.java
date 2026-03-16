class Animal2 {
    void sleep(){
        System.out.println("The Animals oftend sleep");
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
class Dog extends Animal2{
    void DOG(){
        System.out.println("This is Dog");
    }
}
public class Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.DOG();
        c1.CAT();
        d1.sleep();
        c1.sleep();
        d1.drink();
        c1.drink();
    }
}
