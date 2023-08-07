package day24_CustomMethods_Return;

public class ReturnStatement {


    public static void main(String[] args) {

        nameOfDay(2);
    }

    public static void nameOfDay(int number){

        if(number < 1 || number > 7){ // once this condition is true ==> if the number is invalid
            System.out.println("Invalid"); // prints invalid
            return; // exits nameOfDay method

        }

        if(number == 1){
            System.out.println("moNday");
        }else if (number == 2){
            System.out.println("tueSday");
        }else if (number == 3){
            System.out.println("wednEsday");
        }else if (number == 4){
            System.out.println("thuRsday");
        }else if(number == 5){
            System.out.println("friDay");
        }else if (number == 6){
            System.out.println("satuRday");
        }else{
            System.out.println("sunDay");
        }
    }

}
