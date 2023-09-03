package aHomeTask.day42.studentTask;

public class Person {

    private final String name;
    private final int age;
    private final char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name should not be null or empty");
        }

        for (char eachCh : name.toCharArray()) {
            if (!Character.isLetterOrDigit(eachCh)){
                throw new IllegalArgumentException("Name should not contain any special character and/or space");
            }
        }
        return name;
    }

    public int getAge(){
        if(age <= 0 || age >= 100 ){
            throw new ArithmeticException("Age can not be negative or greater than 100");
        }
        return age;
    }
    public char getGender(){
        if( !(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Gender must be either F or M");
        }
        return gender;
    }

    public void eat(){
        System.out.println( getName() + " is eating ramen.");
    }
    public void drink(){
        System.out.println(getName() + " is drinking alkaline water.");
    }
    public void sleep(){
        System.out.println(getName() + " is sleeping on a luxurious king size bed");
    }
    public String toString(){
        return
                "Name:\t" + getName() + "\nAge:\t" + getAge() + "\nGender:\t" + getGender();
    }


}
/*
Student Task:
	1. Create a class named Person:
			Variables:
				name, age, gender

			Encapsulate all the fields

			Add a constructor that can set all the fields

					Condition:
						1. name should not be set to null
						2. name should not be empty
						3. name should not contain any special character other than space
						4. age should not be set to negative
						5. gender must be valid

			Methods:
				eat()
				drink()
				sleep()
				toString()

 */