package Basicprograms;

public class Array {
	
/*Default constructor is not created by compiler when 
 * it sees a user-defined constructor been declared. 
 * */

	 Array(int x) // User defined constructor
		{
			System.out.println("This is a constructor");
		} 
	
	public static void main(String[] args)
	{
	//	Array Ob = new Array();// Default constructor cannot be called. 
		
		new Array(10); //integer Parameterized constructor call 
	}
}



//new Array(); 

	
	
//	new Array(11,'r');

/*
Array()
{
	System.out.println("This is the first constructor being called ");
}


Array(int y, char s)
{
	System.out.println("This is the third constructor with integer and character");
}

/*
 	 //import Basicprograms.Ruturaj; /* This is importing class name Ruturaj.java in
 					//			the same package name basicprograms

	void Array() // This is constructor with Void return type
	{
		System.out.println("10th standard"); // Statement excecuted by calling Array() constructor 
	}

	void Horus()
	{
		System.out.println("12th standard"); // Statement exeucuted by calling Horus() constructor
	}
	
	public static void main(String[] args) // main method
	{
		Array obj = new Array(); // Classname objectname = new Classname();
		Array obj1 = new Array(); 
		Ruturaj RT = new Ruturaj();
		
		obj.Array();
		obj1.Horus();
		RT.Ruturaj();
		
		anubis(); // Method called
		
		//System.out.println(obj.Array());
	}
	*/
 

/*
int a[] = {45,67,89,32};
int size = a.length;
int lastindex = size-1; // 8 - 1 = 7 - 1 = 6

		
for(int i=0; i<=lastindex;i++)
{
	System.out.print(a[i] + " ");
}

// Reverse the array			
	for(int i=0; i< a.length/2; i++)
	{
		int c = a[i]; // This is where the values of the array is transferred 
		a[i]=a[lastindex - i];
		a[lastindex - i] = c;
	}
	System.out.println(); //line change 

for(int i=0;i<=lastindex;i++)
{
	System.out.println(a[i]+ " ");
}

*/

/*
int a [] = {34, 45, 67, 56};

int size = a.length;
int lastindex = size - 1; 

System.out.println("The total size of the array is: "+size);
System.out.println("The last index of the array is: "+lastindex);
System.out.println(" ");
System.out.println("Values are: ");

for(int i = 0; i<=lastindex; i++)
{
	System.out.println(a[i]);
}
System.out.println("---Reverse----");
//Printing the array in reverse form 

int b [] = new  int[a.length];

b[0] = a[3];
b[1] = a[2];
b[2] = a[1];
b[3] = a[0];

a = b; // By writing a = b, all the values of newly created b[] array will go into a[]

for(int i = 0; i<=lastindex;i++)
{
	System.out.println(b[i]);   
}
*/


/*
int a[] = new int [5]; // Declaring an array of size 5. Starting with index value 0 and last index to be 4. 
// This above way of initializing is used when we have a array with fixed values and size. 

//Storing all the fixed values as per each index. 
a[0]=50;
a[1]=100;
a[2]= 150; 
a[3]=200;
a[4]=250; 

System.out.println(a[4]);
*/

/*
int a[] = {34, 45, 67, 9, 87, 45}; // This is the second way of declaration where there is no need to assign a fixed size. 

for(int i=0;i<a.length;i++) // A for loop is used here to count the index values called by a.length keyword 
{
System.out.println(a[i]); // This statement helps to print all the values out of the array
}
*/


