package MyFirstProject;
class A
{
	void msg()
		{
			System.out.println("Hello Java");
		}
	
}
	
public class FirstJavaClass extends A
	{	
		
	void msg() 	{ System.out.println("Hello Java"); }
	
	public static void main(String[] args) {
		
		FirstJavaClass obj = new FirstJavaClass();
		obj.msg();
		
	}		
}
