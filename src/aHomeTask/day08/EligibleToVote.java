package aHomeTask.day08;

public class EligibleToVote {

    public static void main(String[] args) {


        // suppose the below information is given
        // Eligible for both
        // Not Eligible
        // ONE OF THEM WILL NOT BE EXECUTED!!!

        String name = "talkativeAnt";
        int age = 38;
        String citizen = "USA";

        boolean isEligibleToVote = age >= 21 && citizen == "USA"; // 21 or older && and also usa citizen

        if(isEligibleToVote){ // is eligible
            System.out.println("Eligible");
        }

        //Not Eligible

        if (!isEligibleToVote){ // not eligible
            System.out.println("Not Eligible");
        }

    }


}
