class LivingBegin {
    void breathe(){
        System.out.println("Living begins breath oxygen");
    }
}
class Human extends LivingBegin {
    void think(){
        System.out.println("Human is thinking");
    }
}
class Employee extends Human {
    void work(){
        System.out.println("Employee is working");
    }
}
public class Multilevel {

    public static void main(String[] args) {
        Employee e = new Employee();

        e.breathe();
        e.think();
        e.work();
    }
}
