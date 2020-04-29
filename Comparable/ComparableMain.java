package co.java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {
	
	  public static void main(String[] args)
	  {
		  
	
	 ArrayList<Movie> list = new ArrayList<Movie>(); 
     list.add(new Movie("Force Awakens", 8, 2015)); 
     list.add(new Movie("Star Wars", 8, 1977)); 
     list.add(new Movie("Empire Strikes Back", 8, 1980)); 
     list.add(new Movie("Return of the Jedi", 8, 1983)); 

     Collections.sort(list); 

     System.out.println("Movies after sorting : "); 
     for (Movie movie: list) 
     { 
         System.out.println(movie.getName() + " " + 
                            movie.getRating() + " " + 
                            movie.getYear()); 
     } 
 } 
} 


