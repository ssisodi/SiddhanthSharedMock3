package Metrostring;

public class lastindextype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; 
	    String b = "  VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity");
		
		System.out.println("     LastIndexOf()      ");
		
		/*1. Method working: The Java String class lastIndexOf() method returns the last index of the
		 *given character value or substring. If it is not found, it returns -1. The index counter starts from zero.
		* 
		*2.Return type of method: int lastIndexOf(int ch) ---- It returns last index position for the given char value
		*
		*3.Argument of method: int character or substring is passed as argument in lastindex type
		*
		*4.Type of Method:(Static or non-static): LastIndexOf() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/
		
		int result5 = a.lastIndexOf('i');
		System.out.println(result5);
		
		result5 = a.lastIndexOf("velocity"); // Counting only the ending lastIndexof() string
		System.out.println(result5);
		
		result5 = a.lastIndexOf("also");// returning -1 for the string that is not present
		System.out.println(result5);
		
		result5 = b.lastIndexOf('b');// returning -1 for the character that is not present
		System.out.println(result5);
		
		result5 = b.lastIndexOf("also"); // Couldn't identity due to case sensitivity 
		System.out.println(result5); // Uppercase 'ALSO' and lowercase 'also'
		
		a = "velocity is velocity in pune velocIty"; // Case sensitive with 'I' capital
		result5 = a.lastIndexOf("i"); // Ignoring the 'I' and counting the next value
		System.out.println(result5);

	}

}
