package batman;

public class Methodoverloading
{

	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	void sum(double ab , int cd)
	{
		System.out.println(ab + cd);
	}
	
	void sum(int nv, double fi)
	{
		System.out.println(nv+fi);
	}
	
		public static void main(String[] args) 
		{
			Methodoverloading M = new Methodoverloading();
			M.sum(4, 5);
			M.sum(4, 5, 7);
			M.sum(250.00, 40);
			M.sum(40, 7.6);		
		}

}
