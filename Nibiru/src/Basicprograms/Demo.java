package Basicprograms;

public class Demo {
				
		static void test()
		{
			System.out.println("static testing");
		}
		void alpha()
		{
			System.out.println("Non-static");
		}
				
public static void main(String[] args) 	{
	// static method call 
	test();
	Demo.test();
	
	// alpha();
	// Demo.alpha();
	
	Demo x = new Demo();
	// non-static method call 
	x.alpha();
	// static method call 
	x.test(); 
	}
}



/*
System.out.println(" Before object created");
System.out.println("Demo.a: " + Demo.a);

Demo x = new Demo();
Demo y = new Demo();

System.out.println("After object created");
System.out.println("Demo.a: "+ Demo.a);
System.out.println("x.a: " + x.a);
System.out.println("y.b: "+ y.a);

System.out.println("==========");
x.a = 1555; // static variable changed by x object. 

System.out.println("Demo.a: " + Demo.a);
System.out.println("x.a: "+ x.a);
System.out.println("y.a: "+ y.a);
*/