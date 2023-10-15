package aHomeTasks.day12;

import java.util.Scanner;

public class People02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with");

        int number = scan.nextInt();

        scan.close(); // once the user enters input, this scanner will be closed

        String huseyin = "";

        if(number < 3){
            huseyin = "Live with less than 3 people";
        }else if(number <= 6){
            huseyin = "Live with 3-6 people";
        }else{
            huseyin = "Live with more than 6 people";
        }

        System.out.println(huseyin);


    }


}
