package day35_Encapsulation;

public class PersonTask {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet; // static variable because all objects share the same planet
    public static boolean isHuman, hasNose; // isHuman and hasNose are created as static variable because all objects are human and have nose
    public static int numberOfWings, numberOfHead; // number of wings and head are the same for all objects therefore it is static variable
    
    // ExcelSheet : in order to set this variable first we need to locate the file then read and then handle the exception then call every single column and then set it to this variable. in this case it can be done by creating a constructor, in order to finish setting efficiently
public PersonTask(String name, int age, char gender, String language){ // instances belong to the objects so they should be set like this to access them easily

    this.name = name;
    this.gender = gender;
    this.language = language;

}


    // ExcelSheet : in order to set this variable first we need to locate the file then read and then handle the exception then call every single column and then set it to this variable. in this case it can be done by creating a static block, in order to finish setting efficiently
static{ // used to set static variables, instances can not be called here but static variables can like planet isHuman and hasNose and whatever we assign here will be same for all objects
    
    planet = "Earth";
    isHuman = true;
    hasNose = true;
    numberOfHead = 1;
    numberOfWings = 0;
}           // use static block to initialize more than one variable because only 1 can be called directly but not the others // static members that may take more than one single step to set we use static block

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}



    