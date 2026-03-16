class Student {

    int STD_ID;
    String STD_NAME;
    String SUPPLY;

    Student(int std_id, String std_name,String s1,String s2,String s3) {
        this.STD_ID = std_id;
        this.STD_NAME = std_name;
        this.SUPPLY = "You have 3 supply : "+s1+","+s2+","+s3;
    }
    Student(int std_id, String std_name,String s1,String s2) {
        this.STD_ID = std_id;
        this.STD_NAME = std_name;
        this.SUPPLY = "You have 2 supply : "+s1 + "," + s2;
    }
    Student(int std_id, String std_name,String s1) {
        this.STD_ID = std_id;
        this.STD_NAME = std_name;
        this.SUPPLY = "You have 1 supply : "+s1;
    }
    Student(int std_id, String std_name) {
        this.STD_ID = std_id;
        this.STD_NAME = std_name;
        this.SUPPLY = "You have no supply";
    }

    public void display() {
        System.out.println("Student ID   : " + STD_ID);
        System.out.println(SUPPLY);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Student std1 = new Student(101, "Rahul");  
        Student std2 = new Student(102, "Amit", "Maths");  
        Student std3 = new Student(103, "Sneha", "Java", "DBMS");  
        Student std4 = new Student(104, "Priya", "CN", "Python", "DS"); 
        
        std1.display();
        std2.display();
        std3.display();
        std4.display();
    }
}
