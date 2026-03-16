class Person {
    void display(){
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    void study(){
        System.out.println("Student is Studying");
    }
}
public class single {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.display();
        s1.study();
    }
}

