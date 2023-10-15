package aHomeTasks.day39;

public class Animal {

    private String name, breed, size, colour;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }else if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'F' || gender == 'M')){
            System.err.println("Invalid Gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.err.println("Invalid Age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String size, String colour, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(getName() + " is eating.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

/*
Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative
 */