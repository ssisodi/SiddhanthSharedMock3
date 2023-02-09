package Metrostring;

public class Equalsignoretype {

	public static void main(String[] args) {
		String a = "velocity"; // We're creating Object 'a' of String class.
	    String b = "VELOCITY"; // You can also notice String is having capital 'S' which is only used in class reference. 
	    
	    String c = new String("Velocity"); 
		String d = new String("Velocity");
		
		boolean result1 = a.equalsIgnoreCase(b); //true because case is ignored  
		System.out.println(result1);
			
		/*1. Method working: The Java String class equalsignorecase() method method compares the two given strings 
		 * on the basis of the content of the string irrespective of the case (lower and upper) of the string. 
		* 
		*2.Return type of method: It is just like the equals() method but doesn't check the case sensitivity. 
		*If any character is not matched, it returns false, else returns true.
		*
		*3.Argument of method:publicboolean equalsIgnoreCase(String anString) here strings are compared  
		*
		*4.Type of Method:(Static or non-static): Equals method is non-static because it is called by object of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/	
		
		result1 = a.equalsIgnoreCase(c); //true because capital V case is ignored 
		System.out.println(result1);
		
		result1 = a.equalsIgnoreCase(b);// (lower and upper) of the string is ignored
		System.out.println(result1);

	}

}
