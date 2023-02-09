package Keywords;

public class This3 {
	int rollno; //Instance Variable  
	String name;// Or Global Variable   
	float fee;// OR Class Variable
	
This3(int r,String n,float f)
 {  
	/*You can see the global variables 
     * are different from local arguments*/
	rollno=r; // No need for 'this' keyword to reference
	name=n;// No need for 'this' keyword to reference  
	fee=f;// No need for 'this' keyword to reference  
 }  
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
	
	public static void main(String[] args) 
	{
		This3 s1=new This3(111,"ankit",5000f); 
	/* The parameters passed here are called in 
	 * constructor 'This3' arguments*/ 
		This3 s2=new This3(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}
