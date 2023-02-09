package MyFirstProject;

public class MainClass { // only one public class per java file
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
//		Person personObj = new Person();
//		personObj.age = 24;
//		personObj.name = "Varun";
//		personObj.eat();
//		personObj.walk(12);
		
		Person p2 = new Person(31, "John");//overloaded constructor
		p2.walk();
		
//		System.out.println(personObj.age +" "+personObj.name);
//		System.out.println(Person.count);// static variable is accessible only through class
//		
//		Developer d1 = new Developer(24, "Anuj");
//		d1.walk();// will call walk from developer class ----- runtime polymorphism
		
//		EncapsulationInro obj = new EncapsulationInro();
//		obj.doWork();
		
	}

}



//Classes --- 'Object' class is the parent of all classes
class Person {
	protected String name;//protected ---> only available as public to its children
	int age;
	static int count = 0; // static keyword --- no need to create an object
	
//	public Person() {
//		System.out.println("Creating an object using default ctor");
//		count++;
//	}
	
	public Person(int age, String name) {
		//this();// this keyword ---- to call a ctor from another one
		this.name = name;
		this.age = age;
	}
	
	//Methods
	void walk() {
		System.out.println(name +" is walking.");
	}
	
	void eat() {
		System.out.println(name+ " is eating!");
	}
	
	void walk(int steps) { //Polymorphism --- compile time polymorphism
		System.out.println(name+" has walked "+steps+" steps");
	}
}

class Developer extends Person{

	public Developer(int age, String name) {
		super(age, name); // calls parent class ctor
	}
	
	void walk() {
		System.out.println(name +" is walking like a robot!");
	}
	
}

