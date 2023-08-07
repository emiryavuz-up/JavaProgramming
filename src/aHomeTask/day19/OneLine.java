package aHomeTask.day19;

public class OneLine {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 5 ; j++) {

                System.out.println("Random ");
                if(j == 3){
                    break outer;
                }
            }

        }


        for (int i = 1; i <= 3 ; i++) {
            int j = 1;
            while(j <= i){
                System.out.println(j + " ");
                j++;
            }


        }
    }


}
