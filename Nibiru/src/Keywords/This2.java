package Keywords;

public class This2 {
	int rollno;//Global variable
	String name;//Global variable  
	float fee;//Global variable  
/*All variable passed as arguments to 
  the constructor*/  
	This2(int rollno,String name,float fee)
	{  
	this.rollno = rollno;// This keyword referencing global V 
	this.name = name;  // This keyword referencing global V
	this.fee = fee;  // This keyword referencing global V
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee); 
	}  
				
	public static void main(String[] args) {
		
		This1 T1=new This1(111,"ankit",5000f);  
		This1 T2= new This1(112,"sumit",6000f);  
		System.out.println("Without 'this' keyword");
		T1.display();  
		T2.display(); 	
		
		System.out.println("------------------------");
		System.out.println("With 'this' keyword");
		This2 s1=new This2(111,"ankit",5000f);  
		This2 s2= new This2(112,"sumit",6000f);  
		s1.display();  
		s2.display(); 
	}
}
