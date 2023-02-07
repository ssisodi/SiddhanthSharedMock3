package Metrostring;

public class Indexoftype {

	public static void main(String[] args) {
		String a = "velocity is velocity in pune velocity"; 
	    String b = "  VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); 
		String d = new String("velocity");
		
System.out.println("     indexOf()     ");

/*1. Method working: The Java String class indexOf() method returns the index value of the first 
 * occurrence of the specified character or string in a specified string. 
* 
*2.Return type of method: Index value of the searched string or character is returned. 'int' is the return type of it. 
*
*3.Argument of method:int indexOf(int ch) in which the character whose index value is needed is passed. 
*'ch': It is a character value, e.g. 'a'
*
*4.Type of Method:(Static or non-static): indexOf() method is non-static because it is called by object 
*of string in java.lang package. 
*
*5. Class of method: String is a class in java.lang package*/	
		
		int result4 = a.indexOf("i");
		/* Counting only the first count of the character and
		giving the indexof value of it.*/ 
		System.out.println(result4); //5
		
		result4 = a.indexOf("velocity"); // Counting only the starting indexof string
		System.out.println(result4); // 0
		
		result4 = a.indexOf("also");// returning -1 for the string that is not present
		System.out.println(result4);
		
		result4 = b.indexOf('b');// returning -1 for the character that is not present
		System.out.println(result4);
		
		result4 = b.indexOf("also"); // Case sensitive for 'also' and 'ALSO' string  
		System.out.println(result4);
		
		a = "velocIty is velocity in pune velocity"; // Case sensitive with 'I' capital
		result4 = a.indexOf("i"); // Ignoring the 'I' and counting the next value
		System.out.println(result4); // 9 	
	}

}
