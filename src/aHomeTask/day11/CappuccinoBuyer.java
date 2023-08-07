package aHomeTask.day11;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        /*
        CappuccinoBuyer. A variable named Size is given, write a program that can display the price and
         calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

         */


        String size = "tall";
        String result = "";

        if(size == "tall" || size == "grande" || size == "venti"){
            if(size == "tall"){
                result = "Price is $3.99\n90 calories";
            }else if (size == "grande"){
                result = "Price is $3.99\n120 calories";
            }else{
                result = "Price is $4.29\n150 calories";
            }

        }else{
            result = "Invalid Size";
        }
        System.out.println(result);


        System.out.println("-----------------------");


        // WITH SWITCH STATEMENTS

        String size2 = "tall";
        String result2 = "";
        switch (size2){
            case "tall":
                result2 = "Price is $3.69\n90 calories";
                break;
            case "grande":
                result2 = "Price is $3.99\n120 calories";
                break;
            case "venti":
                result2 = "Price is $4.29\n 150 calories";
                break;
            default:
                result2 = "Invalid Size";
        }

        System.out.println(result2);


        System.out.println("-------------------------");


        String size3 = "grande";
        String result3 = "";

        if(size3 == "tall" || size3 == "grande" || size3 == "venti"){

            switch (size3){
                case "tall":
                    result3 = "Price is $3.69\n90 calories";
                    break;
                case "grande":
                    result3 = "Price is $3.99\n120 calories";
                    break;
                case "venti":
                    result3 = "Price is $4.29\n150 calories";
                    break;
            }

        }else{
            result3 = "Invalid Size";

        }
        System.out.println(result3);



            }


}
