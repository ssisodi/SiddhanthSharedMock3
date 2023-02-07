package Metrostring;

public class Trimtype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 
		
		System.out.println("     trim()     ");
		/*1. Method working: The Java String class trim() method eliminates leading and trailing spaces. 
		 * The Unicode value of space character is '\u0020'. The trim() method in Java string
		 * checks this Unicode value before and after the string, if it exists then the method removes the spaces
		 *  and returns the omitted string.
		* 
		*2.Return type of method: string with omitted leading and trailing spaces is returned						 
		*
		*3.Argument of method: 	No argument  
		*
		*4.Type of Method:(Static or non-static): trim() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package
		**/		
		
		String m = "         velocity is velocity in pune velocity         "; 
	    String result12 = m.trim();
		System.out.println(result12);
		
		 String n = "            VELOCITY IS ALSO IN PUNE             "; 
		result12 = n.trim();
		System.out.println(result12);
	}
}
