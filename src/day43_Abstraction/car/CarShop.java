package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {


        //  We can not create object from abstract class because abstract class is not concrete
        // Car car1 = new Car("Smyrna", "Maya", "Golden", 2018, "Priceless");

        Honda honda = new Honda("Honda", "Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Audi", "Q7", "White", 2020, 45000);

        Tesla tesla = new Tesla("Tesla", "Model S", "Red", 2023, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------");

        honda.setColor("Red");
        audi.setColor("Yellow");
        tesla.setColor("Gray");
        honda.setPrice(20000);
        audi.setPrice(50000);
        tesla.setPrice(70000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }

}
