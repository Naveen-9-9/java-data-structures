class Order {
    int orderId ;
    String restaurantName ;
    double totalAmount;
    
    Order(int orderId, String restaurantName, double totalAmount) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.totalAmount = totalAmount;
    }
    
    void placeOrder(){
        System.out.println("orderId :"+orderId);
        System.out.println("restaurantName :"+restaurantName);
        System.out.println("totalAmount :"+totalAmount);
    }
}

class OnlineOrder extends Order{
    String paymentMethod ;
    String transactionId ;
    

    OnlineOrder(int orderId, String restaurantName, double totalAmount,String paymentMethod, String transactionId) {
        super(orderId, restaurantName, totalAmount);
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;

    }
    void payOnline(){
        System.out.println("paymentMethod :" + paymentMethod);
    }
    void displayTransactionInfo(){
        System.out.println("transcationId :" + transactionId);
    }
}
class OfflineOrder extends OnlineOrder{

    String paymentMode;
    double cashCollected ;
    
    OfflineOrder(int orderId, String restaurantName, double totalAmount,String paymentMode, double cashCollected)  {
        super(orderId, restaurantName, totalAmount, paymentMode, paymentMode);
        this.paymentMode  = paymentMode;
        this.cashCollected = cashCollected;
    }
    void payCash(){
        System.out.println( "paymentMethod"+paymentMode); 
    }
    void displayCashCollected(){
        System.out.println( "cashCollected" + cashCollected); 
    }

}

public class Problem06 {
    public static void main(String[] args) {
        OnlineOrder on = new OnlineOrder(501, "pizza hub", 899.50, "UPI", "TXN12345");
        System.out.println("\nOnline order :");
        on.placeOrder();
        on.payOnline();
        on.displayTransactionInfo();

        OfflineOrder of = new OfflineOrder(502, "Biryani House", 650, "cash", 650.00);
        System.out.println("\nOffline order : ");
        of.placeOrder();
        of.payCash();
        of.displayCashCollected();
    }
}

