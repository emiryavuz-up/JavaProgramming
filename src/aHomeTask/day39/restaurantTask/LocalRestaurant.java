package aHomeTask.day39.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Resturant localRestaurant = new Resturant("Smyrna", "Mars", 3);

        localRestaurant.hireServer(new Server("Limon", 35532, 50, true));

        Server server2 = new Server("Maya", 1325, 60, false);

        Server server3 = new Server("Aksel", 1235, 60, true);

        server2.cleanTable();
        server2.takeOrder();
        System.out.println(server2);

        Server[] servers = {server2, server3};

        localRestaurant.hireServers(servers);

        localRestaurant.terminateServer(1325);

        System.out.println(localRestaurant);

    }

}
