package pack2;

import pack1.Pune;

public class Delhi extends Pune {

	public static void main(String[] args) {
		
		System.out.println(Pune.d);
		/*Here you can see the protected static variable 'd' is accessible 
		 * in another class of same package and can only be accessed in 
		 * different package and class using inheritance*/
		
		
		
		
		
		
		
		
		
		System.out.println(Pune.a); 
		/* Here you can see static variable 'a' is accessible 
		 * in different package by Delhi.java class
		 * due to public access modifier which can be accessed
		 * anywhere. */
		
	//	System.out.println(Pune.b); 
		/* Here you can see the default static variable 'b' is accessible 
		 * in the same package by Mumbai.java but won't be accessible 
		 * in Bangalore.java and Delhi.java as they are from different 
		 * package. */	
	//	System.out.println(Pune.c);
		/*Here you can see the private static variable 'c' is accessible 
		 * in the same class and cannot be accessed in another class 
		 * nor another package*/
		
	}

}
