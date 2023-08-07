package aHomeTask.day23;

public class AreaOfCircle {

    public static void main(String[] args) {

    areaOfCircle(20);

    }


    public static void areaOfCircle(double radius){

        double result = 0;
        if(radius > 0){
            double area = 3.14 * radius * radius;
            result = area;
        }

        System.out.println(result);

    }

}
