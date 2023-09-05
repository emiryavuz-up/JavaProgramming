package aHomeTask.day44.deviceTask;

public abstract class Device {

    private final String brand;
    private final String model;
    private int price;
    private String color;
    private final char size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, int price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        if(brand.isEmpty()){
            throw new RuntimeException("Brand can not be empty");
        }
        this.brand = brand;
        if(model.isEmpty()){
            throw new RuntimeException("Model can not be empty");
        }
        for (char eachCh : model.toCharArray()) { // T e s l a
            if( !(Character.isLetterOrDigit(eachCh)) ){
                throw new RuntimeException("Model can not contain special character");
            }
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public char getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(int price) {
        if(price <= 0){
            throw new RuntimeException("Invalid Price: " + price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            throw new RuntimeException("Invalid Color: " + color);
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nBrand = " + brand + '\'' +
                "\nModel = " + model + '\'' +
                "\nPrice = $" + price +
                "\nColor = " + color + '\'' +
                "\nSize = " + size +
                "\nHasBattery = " + hasBattery +
                "\nHasPowerButton = " + hasPowerButton;
    }



}

/*
Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price

 */
