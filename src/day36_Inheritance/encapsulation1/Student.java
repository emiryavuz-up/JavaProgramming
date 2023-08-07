package day36_Inheritance.encapsulation1;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public String getName(){
        return name;
    }

	public int getAge(){
		return age;
	}
	
    public void setName(String name){
        this.name = name;
    }

	public void setName(int age){
		this.age = age;
	}
    

}
/*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any character other than: 'M' and 'F'
						3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all the fields when the object is created
						(requirements of fields in the above must be applied)


			Methods:
				study()
				toString()

 */