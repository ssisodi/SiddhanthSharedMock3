package Encapsulation;

public class ExecutionEn {

	public static void main(String[] args) { // Main method
	
		DemoEn x = new DemoEn(); 
		// Object 'x' created to access the Zero argument constructor
		x.add();
		/*Calling the add() method using 'x' object, so value of 
		private static variable 'a' and local variable'b' and local variable 
		'c' gives us the total of 822*/
		
	/*	System.out.println(a); Value of private variable is not accessible 
		to print but accessible to compute*/ 
		System.out.println("------------------------");
		DemoEn y = new DemoEn(56); 
		/*Object 'y' created to access the Integer argument constructor*/
		y.add(); 
		/*Calling the add() method using 'y' object, so value of 
		local variable 'a' and 	local variable 'b' and 'c' gives us the 
		total of 969 */
		System.out.println("------------------------");	
		
		System.out.println(x.Anubis());
	}
}
/* You can see the private variables can be data is utilized for addition 
 * in add() method, but which variable value (Global or local) 
 * is used is hidden, this is called as Encapsulation */