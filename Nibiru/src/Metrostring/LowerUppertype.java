package Metrostring;

public class LowerUppertype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; // String initialized
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); // Default Constructor for object
		String d = new String("velocity"); 

		System.out.println("     toloawercase()  & toUpperCase()     ");
		System.out.println("                ");
		
		/******   toUpperCase() *******
		* 1. Method working: The java string toUpperCase() method returns the string in uppercase letter.
		* In other words, it converts all characters of the string into upper case letter.
		* 
		*2.Return type of method: string in uppercase letter is returned as string
		*
		*3.Argument of method: No value is passed as argument
		*
		*4.Type of Method:(Static or non-static): toUpperCase() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/
		
		
		String result7 = a.toUpperCase();
		System.out.println(result7);
		
		System.out.println("                ");

		/******   toloawercase() *******
		* 1. Method working: The java string toLowerCase() method returns the string in lowercase letter. 
		* In other words, it converts all characters of the string into lower case letter.
		* 
		*2.Return type of method: string in lowercase letter is returned as string
		*
		*3.Argument of method: No value is passed as argument
		*
		*4.Type of Method:(Static or non-static): toloawercase() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/
		
		result7 = b.toLowerCase();
		System.out.println(result7);
	}
}
