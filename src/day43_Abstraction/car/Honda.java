package day43_Abstraction.car;

public final class Honda extends Car { // final prevents the class from being inherited
    // regular class can not have abstract methods, that's why it can not use abstract methods as it is
    // you can not make this class abstract because you won't be able to create object later on
    // so, it is a mandatory step to focus on details which were ignored with abstract method in the super class: Car
    // Child class is responsible for completing the abstract methods, so Override them

    public Honda(String brand, String model, String color, int year, double price) {
        super("Honda", model, color, year, price);

    }

    @Override
    public void start(){
        System.out.println("Twist the key to start the car. Honda cars are not that smart.");
    }






}
