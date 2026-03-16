class Product {
    String ProductName;
    double Price;
    String Category;
    int ProductId;
    int StockAvailable;

    void displayProductDetails (){
        System.out.println("Product Name : "+ProductName);
        System.out.println("Price : "+Price);
        System.out.println("Category : "+Category);
        System.out.println("Product ID : "+ProductId);
    }
    
    void checkStock(){
         System.out.println("Stock Available: "+StockAvailable);
    }
}

class MobileProduct extends Product{
    String Brand;
    int Ram ;
    int Storage  ;
    int BatteryCapacity  ;
    boolean is5GSupported  ;


    MobileProduct(){
        this.ProductName = "IQOO";
        this.Price = 74999;
        this.Category = "Smart Phone";
        this.ProductId = 301;
        this.StockAvailable = 9;
        this.Brand = "Vivo";
        this.Ram = 12;
        this.Storage = 256;
        this.BatteryCapacity = 6700;

    }
    void displayMobileSpecs(){
        System.out.println("Brand : "+ Brand);
        System.out.println("Ram : "+ Ram);
        System.out.println("Storage  : "+ Storage + " GB");
        System.out.println("Battery Capacity "+ BatteryCapacity + " mAh");

    }
    void display5GStatus(){
        System.out.println("5G Support  : "+ is5GSupported);
    }
    void calculateDiscount(){
        double Discount = 10 ;
        Discount = Price * (Discount / 100);
        double finalPrice = Price - Discount;
        System.out.println(finalPrice);
    }
    void displayCompleteProductDetails(){
        displayProductDetails();
        displayMobileSpecs();
        display5GStatus();
        calculateDiscount();
    }
}

public class Problem02 {
    public static void main(String[] args) {
        MobileProduct p = new MobileProduct();
        p.displayCompleteProductDetails();
    }
}

