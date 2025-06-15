
// SmartDevice Hierarchy
class SmartDevice{
String brand;
String model;
public SmartDevice(String brand, String model){
    this.brand = brand;
    this.model =model;
}
void turnOn(){
    System.out.println(brand + " " + model + " is turning on.....");
}
void turnOff(){
    System.out.println(brand + " " + model + " is turning off......");
}
}
class SmartPhone extends SmartDevice{
    SmartPhone(String brand, String model){
        super(brand,model);
    }
    @Override
void turnOn(){
    System.out.println(brand + " " + model + " smartphone is booting up!");
}
@Override
void turnOff(){
    System.out.println(brand + " " + model + " smartphone is shutting down!");
}
}
class SmartWatch extends SmartDevice{
    SmartWatch(String brand, String model){
        super(brand,model);
    }
    @Override
    void turnOn(){
        System.out.println(brand + " " + model +" smartwatch is activating!");
    }
    @Override
    void turnOff(){
        System.out.println(brand + " " + model + " smartwatch is powering off!");
    }
}
public class SmartDevices{
    public static void main(String [] args){
        SmartDevice phone = new SmartPhone("Apple", "iPhone 16 pro max");
        SmartDevice watch = new SmartWatch("Samsung", "Galaxy watch 6");

        phone.turnOn();
        phone.turnOff();

        watch.turnOn();
        watch.turnOff();
    }
}