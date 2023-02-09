package Basicprograms;
/*This is the package that I created and
called Basicprograms*/

public class Hello 
{ 
 public static void main(String[] args) 
/* This is main method, by default we have it 
 * when we create a class*/
{	
		    // create variables
		    int a = 7, b = 11;

		    // value of a and b
		    System.out.println("a is " + a + " and b is " + b);

		    // == operator
		    System.out.println(a == b);  // false

		    // != operator
		    System.out.println(a != b);  // true

		    // > operator
		    System.out.println(a > b);  // false

		    // < operator
		    System.out.println(a < b);  // true

		    // >= operator
		    System.out.println(a >= b);  // false

		    // <= operator
		    System.out.println(a <= b);  // true
 }
}
	 
	/*
		    // declare variables
		    int a = 12, b = 5;

		    // addition operator
		    System.out.println("a + b = " + (a + b));

		    // subtraction operator
		    System.out.println("a - b = " + (a - b));

		    // multiplication operator
		    System.out.println("a * b = " + (a * b));

		    // division operator
		    System.out.println("a / b = " + (a / b));

		    // modulo operator
		    System.out.println("a % b = " + (a % b));
*/
	 
	 
	 
	 
	 
/*	
	 // THIS IS A PROGRAM TO HIGHLIGHT ASSIGNMENT OPERATOR '=' WORK. 
	 
	 byte x = 0 ; // x is a variable declared, initialized with value 0
	 byte a = 45; // a is a variable declared, initialized with value 45
	 byte b = 47; // b is a variable declared, initialized with value 47
	
	System.out.println("Initial value of a:"+ a); //Print output statement for initial value of a 
	System.out.println("Initial value of b:" + b);//Print output statement for initial value of b
	
	x = a;// Value of a = 45 is added from right to left. So, x is now 45 	
	a = b;// Value of b = 47 is added from right to left. So, a is now 47
	b = x;// Finally, b is left blank with 0 value so we're adding x's new value to b. So, b = 45 
	
	//This for loop below is used for presentation purpose in output. 
	for(int i=0; i<=10;i++) // 0 to 9 iterations are created with this
	{
		System.out.print("__"); // _ is used in double quotes " " to create a ____ line
		/* One more thing, print is used instead of println 
		 * to print the values horizontally.*/ 
		 
	/*}
	System.out.println(" "); // Once, for loop finishes, space is created 
	System.out.println(" ");// This is not a printing mistake, its because we need more vertical space. 
	
	System.out.println("Swapped value of a:"+ a);// Swapped value of a is printed
	System.out.println("Swapped value of b:" + b); // Swapped value of b is printed

}*/



