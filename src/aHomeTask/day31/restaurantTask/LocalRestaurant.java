package aHomeTask.day31.restaurantTask;

import aHomeTask.day31.restaurantTask.Chef;
import aHomeTask.day31.restaurantTask.Restaurant;
import aHomeTask.day31.restaurantTask.Server;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Aksel","Salezego 6", 3);

        Server[] servers = {
                new Server("Aksel", 553, 30, true),
                new Server("Naya", 54213, 60, true),
                new Server("Smyrna", 1321, 40, false)
        };

        Server server = new Server("Leika", 334, 20, true);

        Chef chef = new Chef("Maya", 312, 30, false);

        Chef[] chefs = {new Chef("Michael", 235, 50, false)};

        restaurant.hireServer(server);

        restaurant.hireServer(servers);

        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println("---------------------");

        System.out.println(server);

        System.out.println("---------------------");

        System.out.println(Arrays.toString(servers));


        server.takeOrder();
        server.cleanTable();

        chef.makeOrder();
        chef.washDishes();


    }


}

/*
Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */