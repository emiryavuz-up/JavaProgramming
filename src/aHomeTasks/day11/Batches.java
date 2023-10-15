package aHomeTasks.day11;

public class Batches {

    public static void main(String[] args) {

        /*
        We have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */

        String batchType = "US morning";
        String result = "";

        if(batchType == "US morning" || batchType == "US evening" || batchType == "EU"){
            if(batchType == "US morning"){
                result = "Class times are 10-5 EST. M, T, Th, F.";
            }else if(batchType == "US evening"){
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }else{
                result = "Class times are  10-5 EST. M, T, W, Th, F";
            }

        }else {
            result = "Invalid Batch";
        }

        System.out.println(result);


        System.out.println("--------------------");


        String batchType2 = "US evening";
        String result2 = "";
        switch (batchType2){
            case "US morning":
                result2 = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result2 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result2 = "Class times are  10-5 EST. M, T, W, Th, F";
                break;
            default:
                result2 = "Invalid Batch";
        }
        System.out.println(result2);


        System.out.println("---------------------");

        String batchType3 = "EU";
        String result3 = "";


        if(batchType3 == "EU" || batchType3 == "US morning" || batchType == "US evening"){

            switch (batchType3){
                case "EU":
                    result3 = "Class times are  10-5 EST. M, T, W, Th, F";
                    break;
                case "US morning":
                    result3 = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result3 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
            }

        }else{
            result3 = "Invalid Batch";
        }

        System.out.println(result3);

    }


}
