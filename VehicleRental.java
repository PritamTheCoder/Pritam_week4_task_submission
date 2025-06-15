
// Vehicle Rental System
class Vehicle{
String plateNumber;
double baseRate;
public Vehicle(String plateNumber, double baseRate){
    this.plateNumber=plateNumber;
    this.baseRate=baseRate;
}
public double calculateRental(int days){
    return baseRate * days;
}
@Override
    public String toString() {
        return "Vehicle [Plate: " + plateNumber + ", Base Rate: " + baseRate + "]";
    }
}
class Car extends Vehicle{
    int days;
    public Car(String plateNumber, double baseRate){
        super(plateNumber,baseRate);
    }
    @Override
    public double calculateRental(int days){
        return baseRate * days;
    }
}
class Truck extends Vehicle{
    int days;
    double loadFee;
    public Truck(String plateNumber, double baseRate,double loadFee){
        super(plateNumber,baseRate);
        this.loadFee = loadFee;
    }
    @Override
    public double calculateRental(int days){
        return (baseRate* days) + loadFee;
    }
}
class Bike extends Vehicle{

public Bike(String plateNumber, double baseRate){
    super(plateNumber,1500);

}
@Override
public double calculateRental(int days){
    return baseRate; // since fixed rate regardless of days.
}
}
public class VehicleRental{
    public static void main(String [] args){
        Car car1 = new Car("1245NOp",2400);
        Truck T1 = new Truck("5555L",3500,500);
        Bike b1 = new Bike("9876B", 1800);
int days = 3;
        System.out.println("Car rental for " + days + " days: $" + car1.calculateRental(days));
        System.out.println("Truck rental for " + days + " days: $" + T1.calculateRental(days));
        System.out.println("Bike rental (fixed): $" + b1.calculateRental(days));
    }
}