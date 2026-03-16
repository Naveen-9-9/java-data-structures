class Person {
     String Name ;
     int PhoneNumber ;
     int age ;

    void displayPersonInfo (){
        System.out.println("Person Name : "+Name);
        System.out.println("PhoneNumber : "+PhoneNumber);
        System.out.println("Age : "+age);
    }
}

class DeliveryPartner extends Person{
    String Vehicle ;
    String PartnerId ;
    int totalDevelivers;
    
    void displayVehicleInfo(){
        System.out.println("Vehicle Type : " + Vehicle);
    }
    void displayDeliveryStats(){
        System.out.println("Partner id : " + PartnerId);
        System.out.println("Total Develivers : " + totalDevelivers);
    }
}
class ZomatoPartner extends DeliveryPartner{
    String area;
    String ShiftTimng ;
    double rating ;

    void displayAreaInfo(){
        System.out.println( "Develivery" + area); 
        System.out.println( "ShiftTimng" + ShiftTimng); 
        
    }
    void displayRating(){
        System.out.println( "Rating" + rating); 
    }
}

public class Problem03 {
    public static void main(String[] args) {
        ZomatoPartner z= new ZomatoPartner();
        z.Name = "Ravi Kumar";
        z.PhoneNumber = 98654;
        z.age = 25   ;
        z.Vehicle = "Bike";
        z.PartnerId = "ID176535H";
        z.totalDevelivers = 320   ;
        z.area = "Banjara Hills ";  
        z.ShiftTimng = "Morning"   ;
        z.rating = 4.6 ;

        z.displayPersonInfo();
        z.displayVehicleInfo();
        z.displayDeliveryStats();
        z.displayAreaInfo();
        z.displayRating();
        }
}

