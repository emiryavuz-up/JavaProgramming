package aHomeTask.day09;

public class OxygenTank {

    public static void main(String[] args) {

    /*
    OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
    and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY


     */

        int number = 30;
        String result = "";

        if       (number >= 90){
            result = "Your tank is full";
        }else if (number >= 80 && number <= 89){ // ONE BY ONE EXECUTION OLACAGI ICIN
            result = "Still Okay";
        }else if (number >= 70 && number <= 79){ // ARALIK BELIRTMEYE GEREK YOK
            result = "Don't Go Too Far";
        }else if (number >= 60 && number <= 69){ // FAKAT YINE DE BURADA BELIRTILDI
            result = "Start To Head Back";
        }else{
            result = "Be Careful Now You Are At 50%";
        }

        System.out.println("result = " + result);
    }


}
