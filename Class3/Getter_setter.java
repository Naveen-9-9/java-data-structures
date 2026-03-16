class Laptop {
    private String Brand = "HP";
    public void ShowBrand(){
        System.out.println(Brand);
    }

    public void ChangeBrand(String NewBrand){
        Brand = NewBrand;
    }
}

public class Getter_setter {
    public static void main(String[] args) {
        
        Laptop lap = new Laptop();
        lap.ShowBrand();
        lap.ChangeBrand("Dell");
        lap.ShowBrand();
    }
}