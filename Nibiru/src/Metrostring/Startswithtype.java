package Metrostring;

public class Startswithtype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 
		
		System.out.println("     startswith()     ");
		System.out.println("                      ");
		
		/*1. Method working: The Java String class startsWith() method checks if this string starts with the given prefix.
		* 
		*2.Return type of method: It returns true if this string starts with the given prefix; else returns false.						 
		*
		*3.Argument of method: 	public boolean startsWith(String prefix) //prefix : Sequence of character
			public boolean startsWith(String prefix, int offset) //	offset: the index from where the matching of the string prefix starts.  
		*
		*4.Type of Method:(Static or non-static): startswith() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package
		**/		
		
		/*String a = "velocity is velocity in pune velocity";*/
		
		boolean result13 = a.startsWith("velo");
		System.out.println(result13);
		
		result13 = a.startsWith("Velo");
		System.out.println(result13);
		
		result13 = a.startsWith("vlo");
		System.out.println(result13);
		/*String b = " VELOCITY IS ALSO IN PUNE"; */
		result13 = b.startsWith("VELO");// Case sensitive
		System.out.println(result13);
		
		result13 = b.startsWith(" VELO");// Immune to space
		System.out.println(result13);

	}

}
