package Metrostring;

public class Stringtype {

	public static void main(String[] args) {
		
		String a = "velocity is velocity in pune velocity"; // String initialized
	    String b = " VELOCITY IS ALSO IN PUNE"; 
	    String o = " ";
	    String h = null; 
	    
	    String c = new String("Velocity"); // Default Constructor for object
		String d = new String("velocity"); 
		
		System.out.println("        Equals()      ");
		boolean result = a.equals(b);// a compared with b (case sensitive)
		System.out.println(result); // True
		
		result = a.equals(c);
		System.out.println(result); //false
		
		result = a.equals(d);
		System.out.println(result);// True 
		
		System.out.println("---------------------------");
		
		System.out.println("     Equalsignorecase()      ");
		
		boolean result1 = a.equalsIgnoreCase(b); // a compared with b (non-case sensitive)
		System.out.println(result1);
		
	//	b = "Pune"; // Value being override 
		result1 = a.equalsIgnoreCase(b);
		System.out.println(result1);
		
	//	b = "VELOCITY"; // Value in UpperCase
		result1 = a.equalsIgnoreCase(b);
		System.out.println(result1);
		
		System.out.println("---------------------------");
		
		System.out.println("     Contains()      ");
		
		boolean result3 = a.contains("velo");
		System.out.println(result3);
		
		result3 = b.contains("velo");
		System.out.println(result3);
		
		result3 = b.contains("VELO"); // Not affected by space 
		System.out.println(result3);
		
		System.out.println("---------------------------");
		
		System.out.println("     IndexOf()     ");
		
		int result4 = a.indexOf('i');
		/* Counting only the first count of the character and
		giving the indexof value of it.*/ 
		System.out.println(result4);
		
		result4 = a.indexOf("velocity"); // Counting only the starting indexof string
		System.out.println(result4);
		
		result4 = a.indexOf("also");// returning -1 for the string that is not present
		System.out.println(result4);
		
		result4 = b.indexOf('b');// returning -1 for the character that is not present
		System.out.println(result4);
		
		System.out.println("---------------------------");
		
		System.out.println("     LastIndexOf()      ");
		
		int result5 = a.lastIndexOf('i');
		System.out.println(result5);
		
		result5 = a.lastIndexOf("velocity"); // Counting only the ending lastIndexof() string
		System.out.println(result5);
		
		result5 = a.lastIndexOf("also");// returning -1 for the string that is not present
		System.out.println(result5);
		
		result5 = b.lastIndexOf('b');// returning -1 for the character that is not present
		System.out.println(result5);
		
		System.out.println("------------------------------------------------------");
		
		
		System.out.println("     Replace()      ");
		System.out.println("                ");
		
		String result6 = a.replace('v', 'p'); // Replaced the char 'v' with 'p'
		System.out.println(result6);
		
		System.out.println("                ");
		
		result6 = a.replace("velocity", "deacceleration");// Replaced the charsequence old to new
		System.out.println(result6);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("     toloawercase()  & toUpperCase()     ");
		System.out.println("                ");
		
		String result7 = a.toUpperCase();
		System.out.println(result7);
		
		System.out.println("                ");
		
		result7 = b.toLowerCase();
		System.out.println(result7);
		
		System.out.println("------------------------------------------------------");

		System.out.println("     substring()     ");
		
		System.out.println("                ");
		
		String result8 = a.substring(7);
		System.out.println(result8);
		
//If we don't specify endIndex, the method will return all the characters from startIndex.
		System.out.println("                ");
		
		result8 = a.substring(9,15);
		System.out.println(result8);

		System.out.println("---------------------------");
		
		System.out.println("     isempty()     ");
		
		boolean result9 = a.isEmpty(); 
		System.out.println(result9);

		result9 = b.isEmpty();
		System.out.println(result9);
		
		result9 = o.isEmpty(); // Null will use memory but will not hold any data. 
		System.out.println(result9);
		
	/*	result9 = h.isEmpty();
		System.out.println(result9);*/ // Uncomment this one to under isempty() method
		
		System.out.println("---------------------------");
				
		System.out.println("     split()     ");
			
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
		System.out.println("---------------------------");
			
		
		System.out.println("     CharAt()     ");
		
		char result11 = a.charAt(4); // Index value are accepted as arguments
		System.out.println(result11);
		
		result11 = a.charAt(15);
		System.out.println(result11);
		System.out.println("---------------------------");
		
		System.out.println("     trim()     ");
		String m = "         velocity is velocity in pune velocity         "; 
	    String result12 = m.trim();
		System.out.println(result12);
		
		 String n = "            VELOCITY IS ALSO IN PUNE             "; 
		result12 = n.trim();
		System.out.println(result12);
		System.out.println("---------------------------");
		
		System.out.println("     startswith()     ");
		System.out.println("                      ");
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
		
		System.out.println("---------------------------");
		System.out.println("     endsWith()     ");
		System.out.println("                      ");
		
		boolean result14 = a.endsWith("city");
		System.out.println(result14);
		
		result14 = a.endsWith("city ");// Case sensitive
		System.out.println(result14);
		
		System.out.println("---------------------------");
		System.out.println("     toCharArray()     ");
		System.out.println("                      ");
		
		
		String g = "Reversing is the opposite of forward";
		// String to character array
		char result15 [] = g.toCharArray();
		//Char array printing logic
		String s = "";
		String e = "";
		
		for(int r = 0; r<result15.length;r++)
		{
			System.out.println(result15[r]);
		}
		
		// Array to string
		for(int j = 0 ; j<result15.length ;j++)
		{
			s = s + result15[j];
		}
		System.out.println(s);
		//Array reverse logic
		for(int i = result15.length - 1 ; i>=0 ;i--)
		{
			e += result15[i];
		}
		System.out.println(e);
		System.out.println("---------------------------");
	}
}
