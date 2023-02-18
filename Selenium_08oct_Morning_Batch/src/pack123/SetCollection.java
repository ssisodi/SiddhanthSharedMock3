package pack123;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollection {

	public static void main(String[] args) {
		
		// Insertion 
		//Retrieval 
		//Deletion
		
	HashSet<Integer> s = new HashSet<Integer>();
	
	s.add(56);
	s.add(89);
	s.add(53);
	s.add(20);
	s.add(64);
	
	//Retrieval
	
	for(int x : s)
	{
		System.out.println(x);
	}
	
	System.out.println("===============");
	Iterator<Integer> i = s.iterator(); 
	
	//i.next(); 
	//i.hasNext();
	
	for(int x: s)
	{
		System.out.println(i.next());
	}
	
	System.out.println("===============");
	//Retrieval 
	i = s.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	

	}

}
