package JavaRecap.day39_DeviceTask;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        for (char eachCh : brand.toCharArray()) {
            if(Character.isSpaceChar(eachCh)){
                System.exit(1);
            }
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()){
            System.err.println("Model can not be empty");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnON(){
        System.out.println(brand + " " + model + " is turned on.");
    }
    public void turnOFF(){
        System.out.println(brand + " " + model + "is turned off.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nPrice: $" + price +
                "\nHas Battery: " + hasBattery +
                "\nHas Power Button: " + hasPowerButton;
    }

}

/*
1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()

 */