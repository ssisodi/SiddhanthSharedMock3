package MyFirstProject;

public class Abstraction {

	public static void main(String[] args) {
		
		Audi a1 = new Audi();
		a1.start();
		
		BMW bmw = new BMW();
		bmw.start();
		
	}

}

class Audi extends Car{

	@Override
	void start() {
		System.out.println("Audi is starting now!");
		
	}
	
}

class BMW extends Car{
	
	@Override
	void start() {
		System.out.println("BMW is starting...Vroom!!!");
	}
	
}

abstract class Car { // abstract as only a concept, no real world obj is needed
	int price;
	abstract void start(); // abstract methods need to be mandatorily implemented by child classes
	/*
	 * - Abstract functions can only be a part of abstract classes
	 * - Abstraction can also be achieved using Interfaces
	 * */
	
	void breaks() {
		System.out.println("Car is braking!");
	}
	 
}
