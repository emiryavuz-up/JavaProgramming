package day37_Inheritance.phoneTask;

public class Phone { // parent class: only contains the common features of all the subclasses
    // can not make if final ==> in case it's final Phone class can not contain subclasses
// only subclasses can be final


    public String brand; // not static because it will have different copies for different objects
    public String model; // instance and not static to create more than one copy of model
    public String size; // instance and not static to create more than one copy of size
    public double price; // instance and not static because each phone may have different price
    public String colour; // instance and not static because each phone may have different colour

    public static boolean hasBattery = true; // static variable created because each phone hasBattery regardless of it's brand,name ...

    public Phone(String brand, String model, String size, double price, String colour) { // mandatory for all sub-classes since we set it by ourselves and it's not default
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }

    /*
    static{  // needs several steps to set static variables, so static block is created => this block will just run one time because it has one copy
        hasBattery = true;
        hasCamera = true; // THIS BLOCK IS MORE USEFUL THAN SETTING VARIABLE IN THE CONSTRUCTOR TO RUN IT ONLY ONE TIME INSTEAD OF MULTIPLE TIMES
    } // executes one time, then it will be vanished => Therefore, it can't be used to initialize instance-specific values.
*/
}
