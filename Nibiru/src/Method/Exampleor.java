package Method;
// METHOD OVERRIDING 

//Super class
class John
{
	void sun()// method declaration 
	{
		// body //method definition// Implementation
		System.out.println("This is coming from Super class");
	}
}
//-----------------------------------------------------------------------------------
//Sub class 1
class enock extends John // Sub class 1 inherit properties from Super class
{
	void sun() // method declaration 
	{
		// body //method definition// Implementation
		System.out.println("This is coming from Sub class");
	}
}
//-----------------------------------------------------------------------------------
// Main class
public class Exampleor {
public static void main(String[] args) 
{
	//Method overriding is an advantage of Inheritance
	John Pulsar = new John();// super class object
	Pulsar.sun(); // Super class method
	
	Execution Jin = new Execution(); // Method hiding? OR Method Overriding?
	Jin.sun(); 
	
	//Method hiding is a disadvantage of Inheritance
	enock moon = new enock(); //Sub class object
	moon.sun(); // Sub class 1 method
}
}