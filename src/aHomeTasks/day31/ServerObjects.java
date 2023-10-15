package aHomeTasks.day31;

public class ServerObjects {

    public static void main(String[] args) {

        Server server1 = new Server("Simushy", 123214, 40, true);

        System.out.println(server1);

        server1.takeOrder();


    }
}
