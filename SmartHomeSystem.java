// Smart Home Automation
class Device{
    protected String deviceName;
    public Device(String deviceName){
        this.deviceName = deviceName;
    }

    public String operate(){
        return deviceName + " is operating.";
    }
}

class Light extends Device{
    public Light(String deviceName){
        super(deviceName);
    }

    @Override
    public String operate(){
        return deviceName + " is turning on...";
    }
}

class Thermostat extends Device{
    public Thermostat( String deviceName){
        super(deviceName);
    }

    @Override
    public String operate(){
        return deviceName + "is set at 22 Degree Centigrate.... ";
    }
}

class SecurityCamera extends Device {
    public SecurityCamera(String name) {
        super(name);
    }

    @Override
    public String operate() {
        return deviceName + " started recording....";
    }
}

public class SmartHomeSystem{
    public static void main(String[] args){
        Device[] devices = {
            new Light("Living Room Light"),
            new Thermostat("Hall Thermostat"),
            new SecurityCamera("Front Door Camera")
        };
        for(Device d : devices){
            System.out.println(d.operate());
        }
        }
}