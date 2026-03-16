class Student2 {

    int numb;
    String Name2 ;
    String Branch2 ;


    Student2(int id, String Name , String Branch){
        this.numb = id;
        this.Name2 = Name;
        this.Branch2 = Branch;
    }

    public void Display (){
        System.out.println(this.numb +" "+ this.Name2+" " + this.Branch2);
    }
    public static void main(String[] args) {
        Student2 std1 = new Student2(1 ,"Bunny" , "CSD");
        Student2 std2 = new Student2(2 ,"Saisushman","CSD");

        std1.Display();
        std2.Display();
    }
}