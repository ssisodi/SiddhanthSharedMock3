package batman;

public class ConstructorKumar {

	int i;
	int j;
	
	ConstructorKumar()
	{
	 	i = 10;
	 	j = 20; 
	}
	
	ConstructorKumar(int a, int b)
	{
		i = a;
		j = b;	
	}
	void display()
	{
		System.out.println(i+j);
	}
	
	public static void main(String[] args)  
	
	{
		ConstructorKumar cm1 = new ConstructorKumar();
		cm1.display();

		ConstructorKumar cm2 = new ConstructorKumar(100,200);
		cm2.display();
	}

}
