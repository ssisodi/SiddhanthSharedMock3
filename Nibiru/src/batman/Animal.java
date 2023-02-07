package batman;
// Super can be used to refer immediate parent class instance variable.
// Super can be used to invoke immediate parent class method
// Super can be used to invoke immediate parent class constructor
public class Animal {
		String color = "White";
		/*
		void eating()
		{
			System.out.println("Eating......");
		}*/
		Animal()
		{
			System.out.println("What are you eating");
		}
}

class Dog extends Animal{
	
	String color = "Black";
	Dog()
	{
		super();
		System.out.println("I don't know");
	}
	/*
	void displaycolor() 
	{
		System.out.println(color);
		System.out.println(super.color);
	}*/
	
	/*
	void eating()
	{
		super.eating();
		System.out.println("Eating apple....");
	}*/
}