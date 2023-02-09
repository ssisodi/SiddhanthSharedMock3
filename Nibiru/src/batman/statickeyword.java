package batman;

public class statickeyword 
{
static int a = 10;
int b = 20; 
static String Sin = "JohnCena";
	static void Variable() // static variable
	{
		statickeyword VA = new statickeyword();
		System.out.println(VA.b);
		System.out.println(a);
	}
void rum() 	// Non-static
	{
		System.out.println("Rum is called from here");
		System.out.println(b);
//Non-static methods can access both static & non-static stuff directly
		Variable();
	}
public static void main(String[] args) 
{
	//Static variables and methods can be only accessed through static stuff (Without creating an object)
	System.out.println("Variable method called");	
	Variable();
	
	// Static methods can access non-static stuff only through the use of objects
	statickeyword st = new statickeyword();
	st.rum();
	//System.out.println(st.b);
	
	System.out.println(statickeyword.Sin.length());
}
}
