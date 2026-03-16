class Employee {

    int EMP_ID;
    String EMP_NAME ;
    String EMP_GENDER ;


    Employee(int Emp_ID, String Emp_Name , String Emp_Gender){
        this.EMP_ID = Emp_ID;
        this.EMP_NAME = Emp_Name;
        this.EMP_GENDER = Emp_Gender;
    }

    public void Display (){
        System.out.println(" Employee ID :"+this.EMP_ID +"\n Employee Name :"+ this.EMP_NAME+"\n Employee Gender :" + this.EMP_GENDER);
    }
    public static void main(String[] args) {
        Employee EMP1 = new Employee(101 ,"Bunny" , "Male");
        Employee EMP2 = new Employee(102 ,"Saisushman","Female");

        EMP1.Display();
        EMP2.Display();
    }
}