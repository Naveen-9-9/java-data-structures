class StudentHLW {

    int numb;
    String Name2;

    StudentHLW(int id, String Name){
        this.numb = id;
        this.Name2 = Name;
    }   

    public void Display() {
        System.out.println(this.numb +" "+"I'm"+" "+this.Name2+" "+"a Student in CMRTC");
    }

    public static void main(String[] args) {
        StudentHLW std1 = new StudentHLW(1, "Bunny");
        StudentHLW std2 = new StudentHLW(2, "Saisushman");

        std1.Display();
        std2.Display();
    }
}