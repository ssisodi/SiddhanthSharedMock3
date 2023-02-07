package Metrostring;

public class Isemptytype {

	public static void main(String[] args) {

		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    String o = ""; //Note that here empty means the number of characters contained in a string is zero.
	    String u = " ";
	    String h = null; 
		
	    String c = new String("Velocity"); // Default Constructor for object
		String d = new String("velocity"); 
		
		
		System.out.println("     isempty()     ");

		/*1. Method working: The Java String class isEmpty() method checks if the input string is empty or not. 
		* Note that here empty means the number of characters contained in a string is zero.
		* 
		*2.Return type of method: true if length is 0 otherwise false. Boolean return type.
		*
		*3.Argument of method: Nothing is passed as argument. 
		*
		*4.Type of Method:(Static or non-static): isempty() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/	
		
		boolean result9 = a.isEmpty();
		System.out.println(result9);

		result9 = b.isEmpty();
		System.out.println(result9);
		
		result9 = o.isEmpty(); 
		System.out.println(result9);
		
		result9 = u.isEmpty(); 
		System.out.println(result9);
		
		/*result9 = h.isEmpty();// Null will use memory but will not hold any data. 
		System.out.println(result9);*/ // Uncomment this to see the error

	}

}
