package JavaRecap;

public class day42_ExceptionHandling {

    public static void main(String[] args) {

        /*
        Warmup Task:
	MorningWorkout:
		1. Do 30 push-ups and try pausing 1.5 seconds in each
		2. Do 20 pull-ups and try pausing 2.5 seconds in each

         */

        for(int i = 0; i <= 30; i++){
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){

            }finally{
                System.out.print(i + " push up is completed" + "\r");
            }
        }




    }

}
