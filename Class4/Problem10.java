abstract class Ride {
    int rideId ;
    String customerName ;
    double distance;
    
    Ride(int rideId,double distance, String customerName){
        this.rideId = rideId;
        this.customerName = customerName;
        this.distance = distance;

    }
    
    abstract void calculateFare();
    abstract void displayRideDetails();
}

class BikeRide extends Ride{

    
    BikeRide(int rideId, String customerName, double distance) {
        super(rideId, distance, customerName);
        this.customerName = customerName;
        this.rideId = rideId;
        this.distance = distance;
        
    }
    @Override
    void calculateFare(){
        double BikeFare = 10 +(5*distance);
        System.out.println("Bike Ride Fare: Rs."+BikeFare);
    }
    @Override
    void displayRideDetails() {
    System.out.println("Ride details :");
    System.out.println("rideId :"+rideId);
    System.out.println("customerName :"+customerName);
    System.out.println("distance :"+distance);
    }
}
class CabRide extends Ride{

    CabRide(int rideId, String customerName, double distance) {
        super(rideId, distance, customerName);
        this.rideId = rideId;
        this.distance = distance ;
        this.customerName = customerName;
    }

    @Override
    void calculateFare() {
        double CabFare = 20 +(12*distance);
        System.out.println( "Cab Ride Fare: Rs."+CabFare);
        //comment
    }
    
    @Override
    void displayRideDetails() {
        System.out.println("Ride details :");
        System.out.println("rideId :"+rideId);
        System.out.println("customerName :"+customerName);
        System.out.println("distance :"+distance);
    }
}

public class Problem10 {
    public static void main(String[] args) {
        BikeRide br = new BikeRide(101, "bunny", 12.5);
        CabRide cr = new CabRide(102, "saisushman", 18.0);
        br.calculateFare();
        br.displayRideDetails();
        System.out.println("\n");
        cr.calculateFare();
        cr.displayRideDetails();
    }
}
