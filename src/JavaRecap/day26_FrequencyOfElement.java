package JavaRecap;

public class day26_FrequencyOfElement {

    public static void main(String[] args) {

        int[] array = {1,1,1,2,2,3,4,5,6,6,7,8};
        int n = frequencyOfElement(array, 1);
        System.out.println(n);

    }

    public static int frequencyOfElement(int[] arr1, int element){

        int frequency = 0;

        for(int each : arr1){

            if(each == element){
                frequency++;
            }

        }
        return frequency;


    }


}

/*
1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters:
			 an integer array and an Integer element.
			 The method returns the frequency of the given integer element from the integer array
 */