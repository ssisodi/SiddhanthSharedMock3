package Metrostring;

public class Equalstype {

	public static void main(String[] args) {
		/*Type1: Declaration without using 'new' keyword
		 * Syntax: String referenceVariable = "Data"*/// Here, reference variable is the object of class String
		String a = "velocity"; // We're creating Object 'a' of String class.
	    String b = "Velocity"; // You can also notice String is having capital 'S' which is only used in class reference.
//--------------------------------------------------------------------------------------------------------------------------------	    
	    /*Type2: Declaration with using 'new' keyword
	     * Syntax: String referenceVariable = new String("Data");
	     * Here,reference variable is the object of class String AND "data" is passed as argument of the constructor String */ 
	    String c = new String("Velocity"); 
		String d = new String("velocity");
//--------------------------------------------------------------------------------------------------------------------------------			
		System.out.println("        Equals()      ");
		//Data comparison
			
		/*1. Method working: The Java String class equals() method compares the two given strings based on the content of the string.
		 * 
		 *2.Return type of method: The return type is Boolean. If any character is not matched, it returns false. 
		 *If all characters are matched, it returns true.
		 *
		 *3.Argument of method: anotherObject : another object, i.e., compared with this string.
		 *
		 *4.Type of Method:(Static or non-static): Equals method is non-static because it is called by object 'a' of String Class. 
		 *
		 *5. Class of method: String is a class in java.lang package*/
		
		boolean result = b.equals(d);// b compared with d
		System.out.println(result); // True
		
		result = a.equals(c); // Case sensitive for V and v
		System.out.println(result); //false	
	}

}
