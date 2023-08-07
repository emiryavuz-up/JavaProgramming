package aHomeTask.day11;

public class Elevator {

    public static void main(String[] args) {

        /*
         Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

         */

        int floorNumber = 2;
        String result = "";

        if(floorNumber == 1 || floorNumber == 2 || floorNumber == 3){
            if(floorNumber == 1){
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }else if(floorNumber == 2){
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }else{
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }



        }else {
            result = "Invalid Floor - 6";
        }
        System.out.println(result);


        System.out.println("-------------------------");


        int floorNumber2 = 87;
        String result2 = "";

        switch (floorNumber2){
            case 1:
                result2 = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            case 2:
                result2 = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            case 3:
                result2 = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            default:
                result2 = "Invalid Floor - 6";
        }

        System.out.println(result2);

        System.out.println("-------------------------");




    }


}
