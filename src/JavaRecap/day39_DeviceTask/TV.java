package JavaRecap.day39_DeviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " changed the current channel with the next one");
    }
    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " changed the current channel with the previous one");
    }

}

/*
Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */