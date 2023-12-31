package JavaRecap.day39_DeviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getModel() + " " + getBrand() + " is calling: " + phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getModel() + " " + getBrand() + " is texting: " + phoneNum);
    }

}

/*
Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */
