package aHomeTask.day31;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Zimbabwe", "Get Rich or Die Trying", "Comedy", "2010 May", "Smyrna");
        movie1.casts.size();
        System.out.println(movie1);
        System.out.println("----------------------");
        movie1.addCast("Asdadadsa");
        movie1.addCasts(new String[] {"B", "C", "D"});
        movie1.casts.size();

        System.out.println(movie1);
    }

}
