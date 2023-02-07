package Keywords;

public class Thiskey {
		static int a = 12; //Global variable  
		int b = 34; //Global variable (Start value)
		 
		void test()
		 {
			 int a = 100; // Local variables (Start value)
			 int b = 200;// Local variables (Start value)
			 System.out.println(a); 
			 System.out.println(b);
			 System.out.println(Thiskey.a); //Class name called 
			 System.out.println(this.a); // This keyword
			 System.out.println("Local variable value 'b' is called: " + this.b);// This keyword
		 }
/* 'this' keyword is used to call the Global variable of the same class 
 * when local variable & global variable name are same.*/
/*This keyword doesn't call the local variable assigned values holds false*/	
		
		
		
		//Compilation - Execution
	public static void main(String[] args) {
		
	    Thiskey g = new Thiskey(); //Object reference 'g' created
		Thiskey e = new Thiskey(); //Object reference 'e' created
		Thiskey f = new Thiskey(); //Object reference 'f' created
		
	    e.b = 111; /* Memory space is assigned 
	    with new value with object reference 'e' */
		f.b = 222; /* Memory space is assigned 
	    with new value with object reference 'f' */
		
	//	System.out.println(g.b); 
		
		g.test();
		System.out.println("------------");
		e.test(); 
		System.out.println("------------");
		f.test();

		
		
//		System.out.println(g.b);
//		System.out.println(e.b);
	}

}
