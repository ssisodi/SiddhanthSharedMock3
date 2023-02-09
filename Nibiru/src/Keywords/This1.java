package Keywords;

public class This1 {
	int rollno;//Global variable
	String name; //Global variable
	float fee; //Global variable 
/*All variable passed as arguments to 
  the constructor*/  
	This1(int rollno,String name,float fee)
	{  
	rollno = rollno;  
	name = name;  
	fee = fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee); 
	}  
			
	public static void main(String args[])
	{  
	 
	}
}
