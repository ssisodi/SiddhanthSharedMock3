package pack1;

public class Methodoveride {
	
public  Methodoveride()
	{
		System.out.println("Kayani Cookies");
	}
 public Methodoveride(int y)
	{
	 	int x  = 10; 
	 	int z = x  + y;
	 	System.out.println(z);
	}
//System.out.println("Kayani Cookies");
	   
public static void main(String[] args) {
		
		new Methodoveride();// constructor call
		
		new Methodoveride(10); // constructor call
	}
}
