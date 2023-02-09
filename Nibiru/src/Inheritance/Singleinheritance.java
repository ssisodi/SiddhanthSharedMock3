package Inheritance; /* Under one package we
have single inheritance performed over multiple classes*/

class A // Parent class
{
	int a; // Parent class variable 
	void display() // Parent class method
	{
		System.out.println(a); 
	}
}

class B extends A /*Here, class B is child class 
that extends the parent class A. Which means all the 
properties of parent class A is now accessible by child class B*/
{
	int b; //Child class variable 
    void impulse() // Child class method 
	{
		System.out.println(b);
	}
}

public class Singleinheritance { // Main class Singleinheritance
	
	public static void main(String[] args) { // Main method 
		
		A bravo = new A(); /*We have created an object for Parent class */
		bravo.a = 100; // Using object bravo.a we're assigning value to a 
		bravo.display(); /* Using object bravo.display() we're accessing the 
		method to display what's in it.*/
		 
		B mike = new B();/*We have created an object for child class */
		mike.b = 200; // Using mike object we're assigning value to b
		mike.impulse();/* Using object mike.impulse() we're accessing 
		the method to display what's in class B*/

// But then where is single inheritance happening? 
		
		mike.a = 150; /*You can see the object of class B is able to access
		the properties of class A because of extends keyword*/ 
		mike.display();/*You can see the object of class B is able to access
		the properties of class A because of extends keyword*/
	}
}
