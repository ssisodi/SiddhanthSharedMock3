package Basicprograms;

//import java.util.*;

public class Forpractice 
{
	
	public static void main(String[] args) 
	{
		for(int i =1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int a=10;a>=i;a--)
			{
				System.out.print(" *");
			}
			
			System.out.println(" ");
	}
}
}
/*
// Triangle wafer balaji traders
for(int i=1;i<=7;i++)
{
	for(int a=1;a<=i;a++)
	{
		System.out.print(" ");
	}
	for(int b=7;b>=i;b--)
	{
		System.out.print("*");
	}
	for(int c=6;c>=i;c--)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
*/

/*
// Van huesan logo star pattern
for(int i=1;i<=10;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int a=10;a>=i;a--)
	{
		System.out.print(" *");
	}
	
	System.out.println(" ");
	*/

/*
// mirror image
for(int i=1;i<=5;i++)
{
	for(int j=5;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	
	for(int m=0;m<=5;m++)
	{
		System.out.print(" ");
	}
	for(int y=1;y<=i;y++)
	{
		System.out.print("*");
	}
	
	System.out.println(" ");
	
}

for(int a=0;a<=5;a++)
{
	for(int b=1;b<=a;b++)
	{
		System.out.print(" ");
	}
	for(int c=5;c>=a;c--)
	{
		System.out.print("*");
	}
	for(int n=0;n<=5;n++)
	{
		System.out.print(" ");
	}
	for(int z=5;z>=a;z--)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
*/

/*
//Pharoh's face pattern
for(int a=1; a<=7;a++) // Outer for loop for upper part
{
	for(int k=6;k>=a;k--) // Spacing in decreasing format 
	{
		System.out.print(" ");
	}
	for(int p=1;p<=a;p++) // Star pattern in increasing format(left side)
	{
		System.out.print("*");
	}
	
	for(int b=1;b<=5;b++) // Vertical Rectangle space in the upper middle side
	{
		System.out.print(" ");
	}
	for(int q=1;q<=a;q++) // Star pattern in increasing format(right side)
	{
		System.out.print("*");
	}
	System.out.println(" "); // This spacing is very crucial for all the for loops to print on next line
}

for(int t=1;t<=5;t++)
{
	for(int y =1;y<=5;y++)
		{
			System.out.print("         ");	// Horizontal rectangle space in the middle format 
		}
}

for(int j=1;j<=8;j++) // Outer loop for the lower part 
{
	for(int m=3;m<=j;m++) // spacing in Increasing format 
	{
		System.out.print(" ");
	}
	
	for(int l=8; l>=j; l--) // Star patter in Decreasing format (Left side) 
	{
		System.out.print("*");
	}
	for(int d=1;d<=5;d++) // Vertical Rectangular spacing in lower middle side  
	{
		System.out.print(" ");
	}
				
	for(int u=8;u>=j;u--) // Star pattern in decreasing format (Right side) 
	{
		System.out.print("*");
	}
	System.out.println(" "); // This spacing is very crucial for all the for loops to print on next line
}*/

/*
// Diamond star shaped 
for(int a = 1;a<=5;a++)
{ 
	for(int c = 4;c>=a;c--)
	{
		System.out.print(" ");
	}
	
	for(int b =1;b<=a;b++)
		{
			System.out.print(" *");
		}
	 System.out.println(" ");			
	 
}
	
for(int k = 1; k<=5;k++)
{
	for(int j=1;j<=k;j++)
	{
	System.out.print(" ");
	}
	
	for(int q = 4; q>=k;q--)
	{
		System.out.print(" *");
	}
	
	System.out.println(" ");
}
*/

/*
for(int b = 1; b<=2; b++) // outer loop 
{
	for(int a = 1; a!=2; a++) // inner loop 
	{
		System.out.println("Hi"); 
	}
	System.out.println(" See it jumped out of the loop for second condition");
}
*/

/*
for(int i = 1; i<=5; i++)
{
	for(int k = 0; k<i; k++)
	{
		System.out.print(" ");
	}
	for(int j = 1; j<=i; j++)
	{
		System.out.print("*");
	}
	System.out.println("");
}
*/




/*Two numbers are entered through the keyboard. 
 * Write a program to find the value of one number raised to the power of another. 
 * (Do not use Java built-in method)*/
/*
int base = 3;
int result = 1; 

for(int power = 3; power!=0; power--)
{
	result = result * base; 
	
}
System.out.println(result);
*/

/*
// Write a program to find the factorial value of any number entered through the keyboard. 

Scanner sc = new Scanner(System.in);
System.out.println("Enter any value of the factorial");
int facto = 1;
int n = sc.nextInt();

for(int i = 1;i<=n;i++)
{
	facto *= i; 
	//int facto = n * (n -i);
	System.out.print(" ");
	System.out.print(facto);
}
//n--;
*/




/*
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
Scanner sc = new Scanner(System.in);
System.err.println("Enter a postive integer, fool !");
int a = sc.nextInt();

for(int b = a; b <= 12; b++)
{
		int mul = a * b;
		System.out.println(mul);
}*/


//Write a program to calculate the sum of first 10 natural number.
		/*
		for(int a=1; a<=10; a++)
		{
			System.out.print(a);
			System.out.print(" ");
		}*/