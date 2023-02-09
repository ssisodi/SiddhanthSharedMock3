package Metrostring;

public class substringtype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; // String initialized
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    
	    String c = new String("Velocity"); // Default Constructor for object
		String d = new String("velocity"); 
		
		System.out.println("     substring()     ");
		
		System.out.println("                ");
		
		String result8 = a.substring(7);
		System.out.println(result8);
		
//If we don't specify endIndex, the method will return all the characters from startIndex.
		System.out.println("                ");
		
		result8 = a.substring(0,8); // endIndex 3 is not counted
		System.out.println(result8);
		
	}

}
