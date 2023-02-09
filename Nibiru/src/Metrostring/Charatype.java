package Metrostring;

public class Charatype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; 
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity"); 
		
		System.out.println("     CharAt()     ");
		
		/*1. Method working: The Java String class charAt() method returns a char value at the given index number. 
		* 
		*2.Return type of method: The index number starts from 0 and goes to n-1, where n is the length of the string. 
		*Index value of it is returned.		* It returns StringIndexOutOfBoundsException, if the given index number is 
		*greater than or equal to this string length or a negative number.
		*
		*3.Argument of method:public char charAt(int index)   in this 'int' value in the form of index is given in output. 
		*
		*4.Type of Method:(Static or non-static): CharAt() method is non-static because it is called by object 
		*of string in java.lang package. 
		*
		*5. Class of method: String is a class in java.lang package*/	
		
		char result11 = a.charAt(4); // integer Index value are accepted as arguments
		System.out.println(result11);
		
		result11 = a.charAt(15);
		System.out.println(result11);

	}

}
