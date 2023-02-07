package Inheritance;

class Parent
{
	int a; 
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int x; 
	void show()
	{
		System.out.println(x);
	}
}

class child2 extends Parent
{
	int p; 
	void chai() 
	{
		System.out.println(p);
	}
}

class child3 extends Parent
{
	int r;
	void coffee()
	{
		System.out.println(r);
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		
		Parent zulu = new Parent();
		zulu.a = 100; 
		zulu.display();
		
		child1 ron = new child1();
		ron.a = 200; 
		ron.display();
		
		/*child2 non = new child2();
		non.chai(); */
	}
}