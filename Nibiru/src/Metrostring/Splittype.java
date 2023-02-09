package Metrostring;

public class Splittype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 
		
		System.out.println("     split()     ");
		
		/*1. Method working: The java string split() method splits this string against given regular expression and returns a char array.
		* 
		*2.Return type of method: Char array is returned so array of strings is the return type							 
		*
		*3.Argument of method: No argument
		*
		*4.Type of Method:(Static or non-static): split() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/
			
		String result6 = a.replace('v', 'p'); // Replaced the char 'v' with 'p'
		
		String [] result10 = a.split("velocity");
		
		for(int q=0;q<result10.length;q++)
		{
			System.out.println(result10[q]);
		}
		System.out.println("_______");
		
		result10 = a.split(" ");
		for(int k = 0; k<result10.length;k++)
		{
			System.out.println(result10[k]);// Spaces removed
		}
	}
}
