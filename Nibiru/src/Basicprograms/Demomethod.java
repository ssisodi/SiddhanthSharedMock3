package Basicprograms;

public class Demomethod {

	static int a = 15; // start value of static variable
		int b = 34; // Start value of non-static variable
	Demomethod() // Constructor with zero argument.
	{
		a=23; // New assignment
		b=67; //Initialization
	}
	
	Demomethod(int h)
	{
		a = 45; // New assignment 
		b = 58; // Initialization		
	}	
public static void main(String[] args) 
{	
	//Every time Constructor is called we do this.  
	/*1. Object create x 
	  2. Non-static variable declaration x.b = 34; 
	  3. Constructor code will be execute x.b = 67; */ 
	
	Demomethod x = new Demomethod();  
	System.out.println("x.b: "+ x.b);
	System.out.println("Demomethod.a: "+ Demomethod.a);
}
}
