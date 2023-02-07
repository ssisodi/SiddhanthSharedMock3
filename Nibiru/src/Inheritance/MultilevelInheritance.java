package Inheritance;

class Alpha // Parent class
{
	int a; // Parent class variable 
	void display() // Parent class method
	{
		System.out.println(a); 
	}
}

class Theta extends Alpha /*Here, class Theta is child class 
that extends the parent class Alpha. Which means all the 
properties of parent class Alpha  is now accessible by child class Theta*/
{
	int b; //Child class variable 
    void impulse() // Child class method 
	{
		System.out.println(b);
	}
}

class Hive extends Theta/*Here, class Hive is child class 
that extends the parent class Theta. Which means all the 
properties of parent class Theta is now accessible by child class Hive*/
{
	int c; 
	void micra()
	{
		System.out.println(c);
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		Alpha sid = new Alpha(); /*We have created an object for Parent class */
		sid.a = 100; // Using object sid.a we're assigning value to a. 
		sid.display();/* Using object sid.display() we're accessing the 
		method to display what's in it.*/
		
		Theta bid = new Theta(); /*We have created an object for child class */ 
		bid.a = 150; //Using object bid.a we're assigning value to a   
		bid.display();/*Using object sid.display() we're accessing the 
		method to display what's in it.*/
		
		Hive vid = new Hive();/*We have created an object for child class*/ 
		vid.b = 300; // Using object vid.b we're accessing the theta class
		vid.impulse(); /*Using object vid.impulse() we're accessing the 
		method to display what's in it.*/
		vid.a = 250;// Using object vid.a we're accessing the Alpha class
		vid.display(); /*Using object vid.display() we're accessing the 
		method to display what's in it.*/		
	}
}
