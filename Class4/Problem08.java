class  Payment {
    String payerName ;
    String paymentDate ;
    double amount;
    
    void makePayment(){
        System.out.println("payment being processed");
    }
    void displayPaymentDetails(){
        System.out.println("amount :"+amount);
        System.out.println("payerName :"+payerName);
        System.out.println("paymentDate :"+paymentDate);
    }
}

class UPIPayment extends  Payment{
    String upiId ;
    String bankName ;
    

    void makePayment(){
        System.out.println("payment being processed");
    }
    void verifyUPI(){
        System.out.println("upiId :" + upiId);
        System.out.println("bank name :" + bankName);
    }
}
class CardPayment extends Payment{

    String cardNumber;
    String cardType ;
    String expiryDate;

    double cashCollected ;
    void makePayment(){
        System.out.println("payment is proccessed via card");
    }
    void verifyCard(){
        System.out.println("cardNummber : " + cardNumber);
        System.out.println("cardType : " + cardType);
        System.out.println("expiryDate : " + expiryDate);
    }

}

public class Problem08 {
    public static void main(String[] args) {
        UPIPayment up = new UPIPayment();
        CardPayment cd = new CardPayment();
        up.payerName = " rahul ";
        up.amount = 8765;
        up.paymentDate = "2026-01-06";
        up.upiId = "bunny@gmail.com";
        up.bankName = " canera bank ";


        up.verifyUPI();
        up.displayPaymentDetails();

        cd.amount = up.amount;
        cd.payerName =up.payerName;
        cd.paymentDate = up.paymentDate;
        cd.cardNumber = "3457678980";
        cd.cardType = "Credit";
        cd.expiryDate = "12/28";
        cd.verifyCard();
        cd.displayPaymentDetails();
    }
}

