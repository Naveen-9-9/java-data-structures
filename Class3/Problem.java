class User 
{
    int userId;
    String userName;

    void setUserDetails(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }
}

class DeliveryPartner extends User {
    String deliveryArea;
    Double deliveryFee;

    void setDeliveryDetails(String deliveryArea, Double deliveryFee) {
        this.deliveryArea = deliveryArea;
        this.deliveryFee = deliveryFee;
    }

    void displayDeliveryDetails() {
        System.out.println("Delivery Area: " + deliveryArea);
        System.out.println("Delivery Fee: " + deliveryFee);
    }
}

public class Problem {
    public static void main(String[] args) {
        DeliveryPartner dp = new DeliveryPartner();

        dp.setUserDetails(12, "Bunny");
        dp.setDeliveryDetails("SSPT", 5000.0);

        dp.displayUserDetails();
        dp.displayDeliveryDetails();
    }
}