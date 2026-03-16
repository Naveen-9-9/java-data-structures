class Account {
    String email ;
    String PhoneNumber ;
    String accountCreatedDate;
    
    Account(String email,String accountCreatedDate, String PhoneNumber){
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }
    
    void displayAccountInfo(){
        System.out.println(email);
        System.out.println(PhoneNumber);
        System.out.println(accountCreatedDate);
    }
}

class Seller extends Account{
    String shopName ;
    int shopId ;
    int totalProducts;
    

    Seller(String email, String phoneNumber, String accountCreatedDate,String shopName, int shopId, int totalProducts) {
        super(email, accountCreatedDate, phoneNumber);
        this.shopName = shopName;
        this.shopId = shopId;
        this.totalProducts = totalProducts;
        
    }
    void displayShopInfo(){
        System.out.println("\nSeller inf : ");
        System.out.println("shopeName : " + shopName);
        System.out.println("shop id : " + shopId);
    }
    void displayProductCount(){
        System.out.println("Total Develivers : " + totalProducts);
    }
}
class VerifiedSeller extends Seller{

    boolean verificationStatus;
    int yearsActive;
    double rating ;
    

    VerifiedSeller(String email, String phoneNumber, String accountCreatedDate,String shopName, int shopId, int totalProducts,boolean verificationStatus, double rating, int yearsActive) {
        super(email, phoneNumber, accountCreatedDate, shopName, shopId, totalProducts);
        this.verificationStatus  = verificationStatus;
        this.yearsActive = yearsActive;
        this.shopId = shopId;
        this.totalProducts = totalProducts;
        this.rating = rating;
    }
    void displayVerificationStatus(){
        System.out.println("\nVerification info : ");
        System.out.println( "Verification"+verificationStatus); 
        
    }
    void displaySellerRating(){
        System.out.println( "Shopid" + shopId); 
    }
    void displayExperience(){
        System.out.println( "Rating" + rating); 
        System.out.println(  "year "+yearsActive); 
        
    }
}

public class Problem04 {
    public static void main(String[] args) {
        Seller s = new Seller("seller@gail.com", "987766555", "10/12/1999", "SIlver", 65, 76);
        s.displayAccountInfo();
        s.displayShopInfo();
        s.displayProductCount();
        VerifiedSeller v= new VerifiedSeller("bunny123@gmiual.com", "2195437867", "9876", "Gold", 987, 65, true, 5.5, 3);
        v.displayVerificationStatus();
        v.displaySellerRating();
        v.displayExperience();
    }
}

