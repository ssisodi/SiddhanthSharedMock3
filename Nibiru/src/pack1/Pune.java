package pack1;

public class Pune {
	
	public static int a = 10; // Public access modifier  
		   static int b = 20; // Default access modifier 
    private static int c = 30; // Private access modifier
    protected static int d = 40; // Protected access modifier

public static void main(String[] args) { // Main method 

// All the static variables are called with class name
	
		System.out.println(Pune.a);// Accessed in all classes and packages.
		System.out.println(Pune.b);// Accessed within the package only
		System.out.println(Pune.c);// Accessed within the class only 
		System.out.println(Pune.d);/* Accessed within the same package 
		but can be accessed in other package with the help of 
		inheritance.*/
	}

}
