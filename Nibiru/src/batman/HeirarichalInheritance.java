package batman;

class alpha
	{
		int a;
		void display()
		{
			System.out.println(a);
		}
	}

class beta extends alpha
{
	int b;
	void foxnut()
	{
		System.out.println(b);
	}
}

class sigma extends alpha
{
	int c; 
	void doe()
	{
		System.out.println(c);
	}
}

public class HeirarichalInheritance {
	
	public static void main(String[] args) 
	{
		beta BT = new beta();
		BT.a = 100;
		BT.b = 150;
		BT.foxnut();
		BT.display();
		
		sigma sig = new sigma();
		sig.a = 150;
		sig.c = 200; 
		sig.display();
		sig.doe();
	}

}
