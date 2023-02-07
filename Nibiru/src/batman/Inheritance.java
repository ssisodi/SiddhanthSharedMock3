package batman;

class A 
{
	int a;
		void display()
	{
		System.out.println(a);
	}
}
class B extends A 
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c; 
	void chint()
	{
		System.out.println(c);
	}
}


public class Inheritance {
	public static void main(String[] args) {
		/*
		 * A obj1 = new A(); obj1.a = 10; obj1.display();
		 */
		/*
		 * B obj2 = new B(); obj2.a = 100; obj2.b = 200; obj2.print(); obj2.display();
		 */
		
		C obj3 = new C();
		obj3.a=200;
		obj3.b=300;
		obj3.c=400; 
		obj3.display();
		obj3.print();
		obj3.chint();
	}

}
