package Basicprograms;

public class Methodprac {
	
	static void horus()		// Here static is shared method with one memory location used at multiple times. 
	{
		System.out.println("God of Egypt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		horus(); // method call 1
		
		horus(); //method call 2
		
		
	}

}
