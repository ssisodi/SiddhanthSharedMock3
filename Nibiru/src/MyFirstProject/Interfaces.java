package MyFirstProject;

public class Interfaces implements Cars,Machine{
	
	public static void main(String[] args) {
		
	}

	@Override // annotation ---- for metadata
	public void start() {
		System.out.println("My cars are starting");
		
	}

	@Override
	public void doSomething() {
		System.out.println("Car is a machine");
		
	}

}

interface Cars {
	void start();
	/* -By default, methods in interfaces are public and abstract
	 *   I.e public abstract void start()
	 * -A class cannot have multiple parents (diamond problem) hence interfaces were introduced
	 */
}

interface Machine{
	void doSomething();
}
