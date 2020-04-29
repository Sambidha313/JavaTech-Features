package co.java.listinterface;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
	
		
		// Creating a linked list
		LinkedList ll = new LinkedList();
		
		//Adding elements to the list
		
		ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of ll: " + ll);
	      
	   // remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion: " + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: " + ll);

	      // get and set a value
	 
	      System.out.println(ll.set(1, "P"));
	      System.out.println(ll.get(2));
	      
		

	}

}
