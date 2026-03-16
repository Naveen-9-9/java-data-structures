class Product {

    int PRD_ID;
    int PRD_PRICE ;
    int QUANTITY;
    String PRD_NAME ;
    String Delivery  = " BLINKIT";


    Product(int PRD_id, String PRD_Name , int PRD_Price,int quantity){
        this.PRD_ID = PRD_id;
        this.PRD_NAME = PRD_Name;
        this.PRD_PRICE = PRD_Price;
        this.QUANTITY = quantity;
    }

    public void Display (){
        System.out.println(" Product ID : "+this.PRD_ID +"\n Product Name : "+ this.PRD_NAME+"\n Product Price : " + this.PRD_PRICE + "\n Quantity : " + this.QUANTITY+"\n Delivery Partner :" + Delivery);
        System.out.println(" ADD TO CART [+]");
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        Product PRD1 = new Product(101 ,"SAMOSA" , 15, 1);
        Product PRD2 = new Product(102 ,"MIRCHI",20,3);
        Product PRD3 = new Product(103 ,"DOSA",40,1);
        Product PRD4 = new Product(104 ,"IDLY",40,4);

        PRD1.Display();
        PRD2.Display();
        PRD3.Display();
        PRD4.Display();
    }
}
