package Keywords;

public class Romeo {
		static int a = 100; // Global variable 
		int b = 150; // Global variable
		
void test1() // Normal way call local variables
	{
		int k = 200;// Local variable
		int j = 250;// Local variable 
		System.out.println(k);//Local variable called
		System.out.println(j);//Local variable called
	}
		
void test2()
	{
		int a = 300; 
		int b = 350; 
		System.out.println(this.a);
		System.out.println(this.b);
	}
		
void test3()
	{
		a = 400; 
		b = 450; 
		System.out.println(this.a);
		System.out.println(this.b);
	}
void test4()
	{
		Romeo Alfa = new Romeo(); 
		Alfa.a = 500; 
		Alfa.b = 550; 
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
		
	public static void main(String[] args) {
		
		Romeo kilo = new Romeo();
		kilo.test1();
		System.out.println("------------");
		kilo.test2();
		System.out.println("------------");
		kilo.test3(); 
		System.out.println("------------");
		kilo.test4();
		
		
		
		
		
	}

}
