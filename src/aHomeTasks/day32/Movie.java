package aHomeTasks.day32;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseDate, director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, String releaseDate, String director, ArrayList<String> casts){
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public void addCast(String cast){
        this.casts.add(cast);
    }

    public void addCasts(String[] casts){
        this.casts.addAll(Arrays.asList(casts));
    }

    public String toString(){
        return
                "Name of the country: " + country +
                        "\nTitle is: " + title +
                        "\nRelease Date is: " + releaseDate +
                        "\nTotal number of cast is: " + this.casts.size();

    }




}
/*
Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

 */