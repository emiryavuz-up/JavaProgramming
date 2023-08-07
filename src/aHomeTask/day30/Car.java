package aHomeTask.day30;

public class Car {

    public String model;

    public String brand;
    public int year;
    public double price;
    public String fuelType;


    public void setInfo2(String model, String brand, int year, double price, String fuelType) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
    }

    public String toString(){
        return "Car model: " + model + "\nBrand: " + brand + "\nYear: " + year + "\nPrice: $" + price + "\nFuel Type: " + fuelType;
    }


    public void on(){
        System.out.println(model + brand + " is on");
    }
    public void off(){
        System.out.println(model + brand + " is off");
    }

    public void parked(){
        System.out.println(model + brand + " is parked");
    }
}
