package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        // new Car(); // create object of the Car (custom class)

        // assign to a variable to re-use it

        Car car1 = new Car(); // like this

         // System.out.println(car1); cant print like this first we need to set them
        // we already created function setInfo to set colour year brand name price of the car

        car1.setInfo("Porsche", "Cayenne Turbo GT", "Midnight Blue", 2023, 170.000);

        System.out.println(car1);

        Car car2 = new Car();

        car2.setInfo("Lamborghini", "Aventador", "Matte Black", 2023, 300.000);
// instead of doing this car2.name = "Lamborghini", car2.model = "Aventador" ...
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Renault", "Clio", "Shitty Blue", 2016, 5000);

        System.out.println(car3);

        Car car4 = new Car();
        car4.setInfo("Audi", "e-Tron GT", "White", 2020, 150.000);

        System.out.println(car4);

        // put them in one place
        // ArrayList
        // but also with Array which is not recommended because it's fixed size so you can't complete this task with Array

       // array version = Car[] cars = {car1, car2, car3, car4};

        ArrayList<Car> carsList = new ArrayList<>();

        carsList.addAll(Arrays.asList(car1,car2,car3,car4));

        // print brand and price each of the car from arrayList
        // so, you should iterate by using for each loop

        for ( Car each : carsList ){ // Car is given as data type
            System.out.println( each.brand + " : " + each.price ); // Car has brand and price so each brand and each price is printed
        }

        System.out.println("------------------------------------------");

        /*
        eligible for recall
        BMW: 2005 ~ 2008
        Toyota: 1995 ~ 1997
         */

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008); // if the car is BMW and car's year greater or equal to 2005 and less than or equal to 2008 will be removed
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

    }

}
