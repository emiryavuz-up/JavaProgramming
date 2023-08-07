package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args){

      Dog dog1 = new Dog(); // assigned to a variable dog1 to make it re-usable

      dog1.name = "Maya"; // instant variable
      dog1.breed = "Toy Poodle";
      dog1.age = 5;
      dog1.gender = 'F';
      dog1.size = "Small";
      dog1.colour = "Apricot";

      Dog dog2 = new Dog();
      dog2.name = "Smyrna";
      dog2.breed = "Golden";
      dog2.age = 5;
      dog2.gender = 'F';
      dog2.size = "Big";
      dog2.colour = "White";

      Dog dog3 = new Dog();

      dog3.setInfo("Jager", "Toy Poodle", 3, 'M', "Big", "Red");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.bark(); // bark method called from first dog object
        dog2.eat(); // eat method from second dog object

      Dog dog4 = new Dog();
      dog4.setInfo("Leika", "Terrier", 1, 'M', "Extra Small", "Mixed");
      Dog dog5 = new Dog();
      dog5.setInfo("Limon", "Not a dog actually", 3, 'F', "Regular Cat Size", "Grey");

      System.out.println("----------------------------");


      Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

      ArrayList<Dog> femaleDogs = new ArrayList<>();
      ArrayList<Dog> maleDogs = new ArrayList<>();

      for (Dog each : dogs) {

      }



    }

}
