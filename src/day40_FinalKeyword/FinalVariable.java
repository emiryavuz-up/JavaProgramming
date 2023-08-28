package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay; // create an object to set it one time to make it unchangeable

    public FinalVariable(String birthDay) { // birthDay will be set by the time it's used
        this.birthDay = birthDay;
    }

    final static String name;

    static{
        name = "CodeBastards";
    }



    public static void main(String[] args) {

        // local variable can be given under this main method

        //restrict the user from changing the pi variable's value
       final double pi = 3.14; // I want this variable to stay constant ==> not changeable

        // pi = 4.14; // final variables can not be re-assigned
        // pi = 5.1; // final variables can not be re-assigned

        final String name;

        name = "Java";

       // name = "Python"; can not be re-assigned

        System.out.println(name);

        System.out.println("---------------------------------------");

        // variable will be called through the object
        // static variable can be called through the class name

        FinalVariable obj = new FinalVariable("May/01"); // variable birthDay = set to May/01
       // obj.birthDay = "June/01"; ==> not possible because it's unchangeable due to variable being final
        System.out.println(obj.birthDay);

        System.out.println("------------------------------------------");

        System.out.println(FinalVariable.name); // called through class name

    //  FinalVariable.name = "Python"; can not be re-assigned ==> static ==> only 1 copy


    }

}
