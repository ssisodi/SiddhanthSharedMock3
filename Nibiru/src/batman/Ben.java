//package batman;
//
//public class Ben 
//{
//	public static void main(String args[])
//	{
//		for(int i=5;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j);
//				
//			}
//			System.out.println("_");
//		}
//	}
//}


//
//package batman; 
//
//public class Ben {
//	public static void main(String args[])
//	{
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(" " + j);
//			}
//			System.out.println();			
//		}
//	}
//}
/*
 Rules of nested loop
 1> The first for loop works for the row and the second loop works for the column. In the pattern programs, Java for loop is widely used.
 2> 
 
 */
//
//package batman; 
//
//public class Ben{
//	
//public static void main(String args[])
//	{
//	 int value = 1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//			 System.out.print(" " + value);
//				value++;
//
//			}
//			System.out.println();
//		}
//	}
//}

//package batman;
//
//public class Ben
//{
//	public static void main (String args[])
//	{
//		int value = 1;
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(value);
//			}
//			System.out.println();
//
//package batman;
//
//public class Ben
//{
//	public static void main(String args[])
//	{
//		int value = 0;
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<i;j++)
//				{
//				System.out.print(value);
//				}
//				value+=1;	
//				System.out.println();
//		}
//	}
//}

/* Loops are only for iteration. So work on the logic of 
what the iteration is printing*/

/* 
Watch this youtube link for the understanding patter problems the better way
 * https://youtu.be/xzstcj3Cuso */

//package batman; 
//
//public class Ben
//{
//	public static void main(String args[])
//	{
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=i;j<=5;j++) // For loop for decreasing triangle 
//		{
//			System.out.print(" "); // The number of spaces should be same as the number of star in the following for loop
//		}
//		
//		for(int k=1;k<=i;k++) // For loop for increasing star triangle
//		{
//		System.out.print("*"); // The number of star characters must be same as the number of stars in the above for loop
//		}
//		System.out.println();
//	}
//	}
//}
// 

//package batman; 
//
//public class Ben
//{
//	public static void main(String args[])
//	{
//			//int a[][] = new int[3][2];
//			
//		int	a[][] = {{100,200},{300,400},{500,600}};
//
//	System.out.println("Looks like this is for the rows:" +" "+ a.length);
//	System.out.println("Looks like this is for the columns:"+" "+a[0].length);
//	
//	
////	for(int i=0;i<a.length;i++) // outer loop
////	{
////		for(int j=0;j<a[i].length;j++) // inner loop
////		{
////		System.out.println(a[i][j]);
////		}
////	}
//	
//// Enhanced for loop for multidimensional array
//	
//	for(int r[]:a) // Here the r[] has data type as interger'int' and is storing the value of a[][] into 'r' which is single dimentional 
//	{
//		for(int i:r) // Here the 'int i is a 
//		{
//			System.out.println(i);
//		}
//	}
//}
//}

//package batman;
//
//public class Ben 
//{
//	public static void main(String args[])
//	{
//		String s="     Welcome    ";
//		
//		System.out.println(s.length());
//		
//		String s1="to the Continental";
//		System.out.println(s.concat(s1));
//		
//		System.out.println(s.trim());
//		
//		System.out.println(s.charAt(10));
//		
//		System.out.println(s1.contains("Con"));
//		
//		System.out.println(s1.equals("the"));
//		
//	}
//}

package batman;


public class Ben
{
	int i;
	String sname;
	double sal;
	
	void getvalues(int id,String name, double g)
	{
		i=id;
		sname = name; 
		sal = g; 
	}
	
	void display()
	{
		
		System.out.println(i+ " "+sname+ " "+sal);
		
}
}



