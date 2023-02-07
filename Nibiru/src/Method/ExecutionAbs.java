package Method;

public class ExecutionAbs {
   public static void main(String[] args) { // Main method
		
		Concrete Con = new Concrete();
		Con.Ron();// Abstract method called
		Con.John();
		Con.test(); // Method hiding
		
		//Methodabstract obj = new Methodabstract 
		Methodabstract obj = new Concrete(); // Up casting 
//    Super Class reference // Sub class object// Constructor 
		obj.Ron();  
		Methodabstract.test(); 
		// Super method called by super class reference 
	}

}
