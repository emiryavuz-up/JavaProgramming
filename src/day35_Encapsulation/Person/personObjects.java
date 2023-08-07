package day35_Encapsulation.Person;

public class personObjects {

    public static void main(String[] args) {


        personClass p1 = new personClass(); // default constructor



        // to set the name of the person
        // we can not do it directly since it is a private variable
        // So, we will use getAge and setAge methods that we created
/*
        p1.getAge();
        System.out.println("First Age: " + p1);
        p1.setName("Smyrna");
        p1.setAge(5);
        System.out.println("After using Setter method for name and age: " + p1);
*/
        p1.setName("Daniel");
        p1.setAge(-100);

        System.out.println(p1.getName() + " : " + p1.getAge());
    }

}
