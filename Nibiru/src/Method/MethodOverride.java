package Method;
import java.util.*; // Java.util class is used to take input from user. 
class Wick  {  // Super class
	
	void panther(int a) // Non-static method
	{
		System.out.println("Black");
	}
}

class Slick extends Wick{ // Sub class
	
	void panther(int b)//non-static method
	{
		System.out.println("White");
	}
}

public class MethodOverride {
	public static void main(String args[])
	{	/*Now we're taking value from the user*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number either 1 or 2: ");	
		int a = sc.nextInt(); // Value stored in variable a
		
		if(a==1)
		{
			Wick coin = new Wick(); // Object for Wick class
			coin.panther(a); 
		}			
		else if(a==2)
		{
			Slick bis = new Slick(); // Object for Slick class
			bis.panther(a);
		}
	}
}
