package co.java.listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDEmo { 
	
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();  // Only String Type
    
    // Adding elements use add()
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    // Using For loop
    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
       
        // Sorting an arraylist
        Collections.sort(cars);  // Sort cars
        for (String i1 : cars) {
          System.out.println(i1);
        }
    
    // To access a particular element use get()
    System.out.println(cars.get(0));
    
   // To update or set index 0 to "Opel"
    System.out.println(cars.set(0, "Opel"));
    System.out.println(cars.get(0));
    
    // To remove the car present at index 0
    System.out.println(cars.remove(0));
    //After removing to check the list of cars
    System.out.println(cars);
  } 
}
}

// There are so many methods present in java.util.Arraylist,use can use various methods to get a complete flow of how arraylist works.

// U can also use ArrayList cars = new ArrayList(); if you want to have numerous data types in your code 

