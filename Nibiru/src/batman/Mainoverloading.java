package batman;

public class Mainoverloading {
	
	public void main(int a)
	{
		System.out.println(a);
	}
	public void main(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
	Mainoverloading Man = new Mainoverloading();
	Man.main(5);
	Man.main(5,6);
	}

}
