package day35_Encapsulation.Person;

public class personClass {

    // unique values => private instance variables are used with Getter and Setter

    private String name; // other classes does not have direct access to this instance variable => used to protect the data
    private int age; // other classes does not have direct access to this instance variable => used to protect the data

    //getters and setters will help in this sense => getter returns whatever data is stored and setter helps to modify it

    // getters returns data stored in private data => is used outside of class therefore they must be public

    //ability to read the private value, we need to create a Getter method

    // encapsulates the data
    public String getName(){ // encapsulates the data // no parameter is needed for Getter
        return name; // reading what the variable name has, other classes has now access through the Getter
    }

    // ability to set the data we need Setter // parameter needs to match with private variable, if it's string data type also needs to be string
    public void setName(String name){ // we do not need to return any value but just change them, parameter is given to be able to change it
        this.name = name;
    }

    public int getAge(){ // Getter
        return age;
    }

    public void setAge(int age){ // Setter

        if (age <= 0 || age > 150) { //when the data set, it should be between 0 and 150
            System.err.println("Invalid Age: " + age); // print this error message
            System.exit(0); // terminate the whole program
        }
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
