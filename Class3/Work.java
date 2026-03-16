class Cirlce {

    float radius;

    Cirlce() {
        System.out.println("Zero Argument ");
    }

    Cirlce(float r) {
        this.radius = r;
    }

    public float area() {
        return 3.14f * radius * radius;
    }

    public float area(Cirlce r) {
        return 3.14f * radius * radius;
    }

    public String toString() {
        return "Radius is: " + radius;
    }

    public boolean equals(Object obj) {
        Cirlce c = (Cirlce) obj;
        return this.radius == c.radius;
    }

}

public class Work {
    public static void main(String[] args) {
        Cirlce c1 = new Cirlce(5);
        Cirlce c2 = new Cirlce(6);
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c1.area(c2));
        System.out.println(c1.equals(c2));

    }
}
