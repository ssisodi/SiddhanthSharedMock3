package Metrostring;

public class Endswithtype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 
		
		System.out.println("     endsWith()     ");
		System.out.println("                      ");
		
		/*1. Method working: The Java String class endsWith() method checks if this string ends with a given suffix. 
		* 
		*2.Return type of method: Boolean value - It returns true if this string ends with the given suffix; else returns false.
		*
		*3.Argument of method:public boolean endsWith(String suffix) in which suffix : Sequence of character you want to find with endswith()
		*
		*4.Type of Method:(Static or non-static): endsWith() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/			
		boolean result14 = a.endsWith("city");
		System.out.println(result14);
		
		result14 = a.endsWith("city ");// Case sensitive
		System.out.println(result14);

	}

}
