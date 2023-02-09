package batman;

public class calculation
{

	 int i = 10; int j = 20;
	  
	 /*Case 1: not taking parameter and
	  also not returning any value
	  
	 void AntiC()  
	 { 
		 System.out.println(i+j); 
	 }*/
	 
	 /*Case 2: Not taking parameter but 
	  returning a value
	  
	  int sum()    
		{
			return(i+j);
		}
	 */
	 /*
	 Case 3: Taking parameter,but not returning any value
	 void sum(int a, int b)
	 {
		 System.out.println(a+b);
	 }
	 */
	 
	 /* 
	 Case 4: Method is taking parameter and also returning a value 
	 int sum(int a, int b)
	 {
		 return(a+b);
	 }
	 */
	 
	 public static void main(String[] args) 
	 { 
	 calculation cal = new calculation();
	 
	 //cal.AntiC(); 		Object for Case1
	 
	 /*int result = cal.sum();		Object for Case2		
	 System.out.println(result);*/
	 
	  // cal.sum(12,20); Object for Case3 
	 
	 /*
	 int chulo = cal.sum(24, 36);
	 System.out.println(chulo);*/
	  }
}
