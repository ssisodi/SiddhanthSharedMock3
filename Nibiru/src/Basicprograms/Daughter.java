package Basicprograms;

public class Daughter extends Inheritance {

	static void Rushi(String a) // USER defined method
	{
		Daughter golu = new Daughter();
		System.out.println(Inheritance.a);
		System.out.println(golu.b);	
		System.out.println(a);
	}
	
	
	public static void main(String[] args) { // Main method // System defined 
		
		Rushi("Myname");
		

	}

}
