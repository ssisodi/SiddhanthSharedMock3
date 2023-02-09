package Encapsulation;

public class DemoEn {
    //Global variable 
	private int a = 23; // Encapsulation
	private int b = 56;  // Encapsulation
	private int c = 45;  // Encapsulation
	
	// Zero argument constructor
	public DemoEn() 
	{
		b = 122; // Local variable
		c = 677; // Local variable
	}
	// Integer argument constructor
	public DemoEn(int f) 
	{
		a = 26; //Local variable
		b = 67; //Local variable
		c = 876;// Local variable
	}
	public int Anubis()
	{
		return this.a;
	}
	
	public void add() // Method 
	{	
	// Addition of all three
		int x = b + c + a;
	// Printing the result
		System.out.println(x);
        System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
