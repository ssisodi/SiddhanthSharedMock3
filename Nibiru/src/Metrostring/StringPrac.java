package Metrostring;
// String
public class StringPrac {

	public static void main(String[] args) {
	/*Type1: Declaration without using 'new' keyword
	 * Syntax: String referenceVariable = "Data"*/// Here, reference variable is the object of class String
	    String a = "velocity"; // We're creating Object 'a' of String class.
	    String b = "velocity"; // You can also notice String is having capital 'S' which is only used in class reference.
	
	 /*Type2: Declaration with using 'new' keyword
	  * Syntax: String referenceVariable = new String("Data");
	  * Here,reference variable is the object of class String AND "data" is passed as argument of the constructor String */ 	    
		String c = new String("velocity"); 
		String d = new String("velocity"); 
	
		/* But, in both the types 1 and 2 if were are only creating an object, then why not use type2 instead of type1??
		 * There are two reasons for this
		 * Reason 1: In type 1, as we also call 'String' as a datatype, we want to make it use as a Datatype.
		 * Reason 2: There is internal memory difference the two types. */
		
		// Compare memory addresses 
		System.out.println(a == b);// True: Constant pool area
		System.out.println(c == d);// False: Non-constant pool area
		System.out.println(a == c);// False: Non-constant pool area
		System.out.println(b == d);// False: Non-constant pool area
	}
}























/*Replacing the start value of b with new value*/
//final String c = "velocity";
//b = "Pune"; // New value 


/*	c = "Pune"; // How final keyword cannot be replaced
System.out.println(a==c);*/
