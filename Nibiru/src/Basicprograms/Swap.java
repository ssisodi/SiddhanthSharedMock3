package Basicprograms;

import java.util.*;
public class Swap {
	void swaalee()
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Before swapping:"+ "a=" + a +" & "+"b=" + b);
		
		x = a; 
		a = b;
		b = x; 
		System.out.println("After swapping:"+ "a="+ a + " & "+ "b= "+ b);
		}
	
	public static void main(String[] args) {
		
		Swap sp = new Swap();
		sp.swaalee();
	}
}
