package aHomeTask.day40.scrumTeam;

public class Person {

    private String name;
    private int age;
    private char gender;
    final String dnaCode;

    public Person(String name, int age, char gender, String dnaCode) {
        setName(name);
        setAge(age);
        setGender(gender);
        this.dnaCode = dnaCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            System.err.println("Invalid Name: " + name);
            return;
        }
        boolean hasNumber = false;

        for (char eachCh : name.toCharArray()) {
            if(Character.isDigit(eachCh)){
                hasNumber = true;
                break;
            }
        }

        if( !(hasNumber) ){
            this.name = name;
        }else{
            System.err.println("Invalid Name: " + name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 90){
            System.err.println("Invalid Age: " + age);
            return;
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( !(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid Gender: " + gender);
            return;
        }
        this.gender = gender;
    }

    public String getDnaCode() {
        return dnaCode;
    }

    public void eat(){
        System.out.println(getName() + " is eating.");
    }

    public void drink(){
        System.out.println(getName() + " is drinking.");
    }
    public String toString(){
        return
                "Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender();
    }

}

/*
Create a class named Person
			variables:
				name, age, gender, dnaCode (Each person will have a unique DNA code that cannot change.)
			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()

 */