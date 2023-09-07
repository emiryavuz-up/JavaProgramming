package day44_Abstraction;

public abstract class Animal {

    private String name; // instance method and NOT static because this variable will have different copies
    private final String breed; // once the breed is set, the breed of that dog will not change ==> final keyword
    private final char gender; // once the gender is set, the breed of that dog will not change ==> final keyword
    private int age; // age can be set again therefore it is NOT final, it will have more than one copy -> it's not static
    private char size; // size can change, we should not make it final, each animals' size is different, so we should not make it static
    private final String color; // color can not change therefore it is final
    public final static boolean canBreath; // Static makes sure this variable has only one copy, final makes sure the value can not be changed

    public Animal(String name, String breed, char gender, int age, char size, String color) {
        setName(name); // condition is checked before setting the variable
        this.breed = breed;
        if( !(gender == 'M' || gender == 'F') ){
            throw new RuntimeException("Invalid Gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        for (char eachChar : color.toCharArray()) {
            if( !(Character.isLetterOrDigit(eachChar)) ){
                throw new RuntimeException("Color can not contain special character.");
            }
        }
        this.color = color;
    }

    // static block is used to set the value of canBreath to true
    static{
        canBreath = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Name can not be empty.");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    // common for all the subclasses / same steps for using this method / therefore it's made final --> value is unchangeable
    public final void drink(){
        System.out.println(name + " is drinking.");
    }

    // different implementations are needed, therefore it's made abstract to also ignore details and hide the data
    // final keyword can not be used, because this method needs different implementation and it's value should be changed
    // overriding this method is a must for subclasses
    public abstract void eat();

    @Override
    public String toString() {
        return
            getClass().getSimpleName() + // class name will be changed in the class that it's used within
                "\nName = " + name +
                "\nBreed='" + breed +
                "\nGender=" + gender +
                "\nAge = " + age +
                "\nSize = " + size +
                "\nColor='" + color;
    }



}

/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */
