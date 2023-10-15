package aHomeTasks.day25;

public class MinNumber {


    public static void main(String[] args) {

        int[] array = {4,3,6,1,2,6,11,2,0,115};

        int min = minNumber(array);

        System.out.println(min);
    }


    public static int minNumber(int[] array){

        int min = array[0];
        //4352

        for (int each : array) {
            if(each < min){
                min = each;
            }
        }
        return min;
    }



}
