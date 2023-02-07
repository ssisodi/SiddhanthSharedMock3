package Basicprograms;

public class Globalocal {
	int a = 10; // Global variable 
	int v = 20; // Global variable 
	
	void grass() 
	{
		int n = 39; // Local variable 
		int a = 43; // Local variable 
	}
	
	Globalocal() 
	{
	//	System.out.println(n);
		/*The local variable 'n' is not being 
		 * accessible in the constructor 
		 * as it is only accessible to grass() */
	}
	
public static void main(String[] args) {
	
	Globalocal cult = new Globalocal();
	cult.grass(); // Method call 
	new Globalocal(); // constructor call 
	}
}
