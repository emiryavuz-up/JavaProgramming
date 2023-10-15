package aHomeTasks.day32;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "Talkative Ant", "Comedy",
                "10 May 2020", "talkativeMoth", new ArrayList<String>(Arrays.asList("Andy, Mandy, Dandy", "Candy Nandy Handy", "Nely, Zeli, Meli")));


        movie1.addCast("adasda");
        System.out.println(movie1);

        movie1.addCasts(new String[] {"dsaas", "hrkjhrk", "jsjrhjkg"});

        movie1.addCasts(new String[] {"asdas", "asdsad", "fgf"});
        System.out.println(movie1);

    }
}
