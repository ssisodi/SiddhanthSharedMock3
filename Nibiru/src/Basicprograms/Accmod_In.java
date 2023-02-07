package Basicprograms;
// Super class
public class Accmod_In {

	private static int a = 10;
	private int b = 20; 
	
	public static int c = 67; 
	public int d = 89; 	
	
	public static void main(String[] args) {
		
	System.out.println(Accmod_In.a);// Private 
	System.out.println(Accmod_In.c); //Public
	
	Accmod_In x = new Accmod_In();
	System.out.println(x.b); //Private
	System.out.println(x.d); //Public
	
	//System.out.println(Alpha.a);//Private
	System.out.println(Alpha.c); //Public
	}
}
