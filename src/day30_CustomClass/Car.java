package day30_CustomClass;

public class Car {


    //5 instance variables
    //5 instance methods

    // we need separate info when it comes to below instance classes, that's why they are created
    // to say first one to green, second yellow and third one is the yellow
    // to make sure they have different copy of the variable they are set to so we can store the data in it

    public String brand; // instance class of brand created because each of the car may have different brand
    public String model; // instance class of model created because each of the car may have different brand
    public String colour; // instance class of colour created because each of the car may have different brand
    public int year; // instance class of year created because each of the car may have different brand
    public double price;
    // we create

    // pass an argument, 5 different in this below case
                //             "BMW"       ,        "X5"     ,          "BLUE   ,       2023    ,           1.2
    public void setInfo (String brandOfCar, String modelOfCar, String colourOfCar, int yearOfCar, double priceOfCar){

        brand = brandOfCar;
        model = modelOfCar;
        colour = colourOfCar;
        year = yearOfCar;
        price = priceOfCar;

    }

    // to generate a toString method to be able to print them with ease, we use shortcut
    // right click --> generate --> toString

    public String toString() { // print the objects of the car
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price= $" + price + // dollar sign is added to specify currency when used with println
                '}';

    }

    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void start(){
        System.out.println(brand + " " + model + " has started");
    }

    public void stop(){
        System.out.println(brand + " " + model + " has stopped");
    }


}
