package Metrostring;

public class Replacetype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 

		
		System.out.println("     Replace()      ");
		System.out.println("                ");
		
		/*1. Method working: The Java String class replace() method returns a string replacing all the
		 * old char or CharSequence to new char or CharSequence.
		* 
		*2.Return type of method: String is the return type
		*
		*3.Argument of method: 
		*		public String replace(char oldChar, char newChar) // oldChar : old character // newChar : new character    
				public String replace(CharSequence target, CharSequence replacement) //target : target sequence of characters
				//replacement : replacement sequence of characters  
		*
		*4.Type of Method:(Static or non-static): Replace() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/
			
		String result6 = a.replace('v', 'p'); // Replaced the char 'v' with 'p'
		System.out.println(result6);
		
		System.out.println("                ");
		
		result6 = a.replace("velocity", "deacceleration");// Replaced the charsequence old to new
		System.out.println(result6);
		
		result6 = b.replace('v', 'P'); // Immune to case sensitive characters.
		System.out.println(result6);// Printing the same statement without changes. 
		
	}

}
