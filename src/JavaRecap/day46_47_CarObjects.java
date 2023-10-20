package JavaRecap;

import day38_Inheritance.carTask.BMW;
import day38_Inheritance.carTask.Car;
import day38_Inheritance.carTask.Tesla;
import day38_Inheritance.carTask.Toyota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day46_47_CarObjects {

    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", "Black", 1920, 500000, 21),
                new BMW("X5", "Black", 1950, 400000, 12000),
                new Toyota("Corolla", "Black", 400, 310000, 2109),
                new BMW("i1", "Black", 2011, 55004, 5000),
                new BMW("i2", "Black", 2005, 55004, 500),
                new BMW("i3", "Black", 2020, 55004, 50),
                new BMW("i4", "Black", 1990, 55004, 5),
                new BMW("i5", "Black", 2023, 55004, 0),
                new Toyota("Rav4", "Black", 2001, 5055321, 523),
                new Toyota("Rav5", "Black", 2001, 5055321, 52),
                new Toyota("Rav6", "Black", 2002, 5055321, 5),
                new Tesla("Model 1", "Black", 2020, 21356, 56213),
                new Tesla("Model 2", "Black", 2021, 121356, 5621),
                new Tesla("Model 3", "Black", 2016, 221356, 562),
                new Tesla("Model 4", "Black", 2015, 321356, 56),
        };

        List<Car> allCars = new ArrayList<>(Arrays.asList(cars));

        List<Car> carsThatAreEligibleForRecall = new ArrayList<>();

        for (Car eachChar : allCars) {

            if(eachChar.brand.equalsIgnoreCase("toyota") && eachChar.year >= 2010 || eachChar.year <= 2012){
                carsThatAreEligibleForRecall.add(eachChar);
            }
            if(eachChar.brand.equalsIgnoreCase("bmw") && eachChar.year >= 1929 || eachChar.year <= 2022){
                carsThatAreEligibleForRecall.add(eachChar);
            }
            if(eachChar.brand.equalsIgnoreCase("tesla") && eachChar.year >= 2015 || eachChar.year <= 2016){
                carsThatAreEligibleForRecall.add(eachChar);
            }
            System.out.println(carsThatAreEligibleForRecall);




            Car carWithHighestMileage = cars[0];
            Car carWithLowestMileage = cars[0];


            for (Car eachChar2 : cars) {

                if(eachChar2.miles > carWithHighestMileage.miles){
                    carWithHighestMileage = eachChar2;
                }
                if(eachChar2.miles < carWithLowestMileage.miles){
                    carWithLowestMileage = eachChar2;
                }
            }

            System.out.println("Highest Mileage: " + carWithHighestMileage);
            System.out.println("Lowest Mileage: " + carWithLowestMileage);


        }


    }

}

/*
1 Given the following array that contains the car objects:
				Car[] cars = {
		                new Toyota("Highlander", 2010, 25000, "White", 255000),
		                new BMW("X5", 2014, 32000, "Red", 12000),
		                new Toyota("Corolla", 2011, 20000, "White", 310000),
		                new BMW("M3", 2015, 33000, "Blue", 14030),
		                new BMW("M5", 2017, 35000, "Black", 15000),
		                new BMW("M4", 2018, 40000, "White", 19000),
		                new BMW("7 Series", 2009, 30000, "Purple", 21000),
		                new BMW("i3", 2011, 30000, "Black", 9000),
		                new Toyota("Camry", 2018, 30000, "Red", 185000),
		                new Toyota("Rav4", 2012, 23000, "Red", 285000),
		                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
		                new Tesla("Model 3", 2015, 45000, "White", 235000),
		                new Tesla("Model Y", 2017, 65000, "Black", 135000),
		                new Tesla("Model X", 2016, 48000, "White", 235000),
		                new Tesla("Model X", 2014, 48000, "White", 236000),
		        };

		        (import them from day38 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Toyota: from year 2010 to 2011
	        							BMW: from year 1929 to 2022
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest mileage

			1.3 Write a program that can display the car that has the lowest mileage

 */