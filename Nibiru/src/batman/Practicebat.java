package batman; // Package batman is a package under which I have saved multiple classes 
import java.util.*; // We're importing java.util to be able to get the input from the user and make the code more scalable

public class Practicebat {
	/*
	 * void newdivide() {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter the values of a and b:"); int a = sc.nextInt(); int
	 * b = sc.nextInt(); int div = a/b;
	 * System.out.println("Division of two number is:" + div); }
	 * 
	 */
	
	void product() // Here I have created a method called Product. Function of method is basically a block of code that only runs when its called. 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values of your choice");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int prod = a*b;
		int add = a + b;
		int sub = a - b;
		int div = a/b;
		System.out.println("Product:" + prod);
		System.out.println("Divison :" + div);
		System.out.println("Addition :" + add);
		System.out.println("Subtraction :"+ sub);	
	}
	
	public static void main(String[] args)
{
		Practicebat pr = new Practicebat();
		pr.product();		
		
	/*
	 * Practicebat spoof = new Practicebat(); spoof.newdivide();
	 */	
			}
}
