package pack123;

import java.util.ArrayList;

public class Collection {

	public static void main(String args[]) {
		

	/*Here we're performing 3 operations
	 * 1. Insertion 
	 * 2. Retrieval
	 * 3. Deletion*/
	
	ArrayList a = new ArrayList();
	
	//Heterogenous collection
	//data insertion
	a.add(500); 
	a.add("Velocity"); 
	a.add(7.756); 
	a.add('g'); 
	
	//Deletion
	a.remove(2); 
		
	
	for (int i = 0 ; i<a.size();i++)
	{
		System.out.println(a.get(i)); // Data retrieval 
	}
	System.out.println("===========================");
	  
	
	ArrayList<String> b = new ArrayList<String>();
	// Homogenous collection
	b.add("Stamper"); 
	b.add("Flyod"); 
	b.add("Petrov");
	b.add("Tusk");
	
	//Advanced for loop 
	for(String s : b)
	{
		System.out.println(s);
	}
}
}