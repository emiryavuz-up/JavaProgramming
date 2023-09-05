package day43_Abstraction.car;

public abstract class Car { // parent class only responsible for providing what is necessary/essentials
    // so, it's created as an ABSTRACT CLASS which is meant to be the parent/super class

    // when variable is final you are required to set it before it's being used
    // before you need to use instance variables, you need to have an object first
    // so a constructor is created to both set the values and fix the compiler error
    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        // for Setter methods we use the conditions
        this.brand = brand;
        this.model = model;
        setColor(color);
        setPrice(price);
        if(year < 1886){
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid Price: " + price);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Brand: " + brand  +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nYear:  " + year +
                "\nPrice: " + price;
    }

    // implementation is the same for all the cars --> just press the break
    public void stop(){
        System.out.println("Press the brake.");
    }


    // implementation may differ from one car to another --> push start, talk start, twist the key to start etc...
    // hiding the implementation and shows the functionality
    // ignore the implementation details of this method
    // so, we create a method that does not have a body
    public abstract void start(); // does not have body and meant to be overridden, so it can not be private, final or static

    }







