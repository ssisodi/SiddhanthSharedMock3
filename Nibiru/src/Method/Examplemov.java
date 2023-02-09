package Method;

public class Examplemov { 
// Constructor overloading 
	/*public Examplemov()
	{
		//constructor with zero argument
	}
	protected Examplemov(int a)
	{
		// Constructor with integer argument 
	}
*/	
// Method overloading 	
	void test() // zero argument method
	{
		System.out.println("Red"); 
	}
	void test(int a) // Int argument method
	{
		System.out.println("Green");
	}
	void test(char s, char r) // // Char argument method
	{
		System.out.println("Blue");
	}

	public static void main(String[] args) {
		
		Examplemov Medal = new Examplemov();
		Medal.test();// zero argument method call
		Medal.test(10);// Int argument method call
		Medal.test('&','%'); // Char argument method call	
	}
}
