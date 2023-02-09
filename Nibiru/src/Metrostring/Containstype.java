package Metrostring;

public class Containstype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; 
	    String b = "  VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity");
		
		System.out.println("     Contains()      ");
		
		/*1. Method working: The Java String class contains() method searches the sequence of characters in this string. 
		* 
		*2.Return type of method: Boolean return type - It returns true if the sequence of char values is found in this 
		*string otherwise returns false.
		*
		*3.Argument of method: public boolean contains(CharSequence sequence) We will type the character values which we want 
		*to check in the main string. 
		*
		*4.Type of Method:(Static or non-static): Contains() method is non-static because it is called by object of
		* string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/	
		
		
   /*Java String class contains() method searches 
    * the sequence of characters in this string.*/		
		boolean result3 = a.contains("velo"); // Found if it contains (velo) in 'a'string 
		System.out.println(result3); // True
		
		result3 = b.contains("velo"); // Case sensitive 
		System.out.println(result3);// False
		
		result3 = b.contains("CITY"); // Not affected by space 
		System.out.println(result3); // True
		
		result3 = b.contains(" "); // Not affected by space 
		System.out.println(result3);// True	    
	}
}
