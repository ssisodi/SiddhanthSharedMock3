package Metrostring;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		//Velocity class pune started in October
		String a = "Velocity class pune started in October";
		/*result [] = {0,1,2,3,4,5}
		For j = 0 to 5
		result[j]*/		
		
		/*Reverse string*/
		 char result[]= a.toCharArray();
	
	 for (int i = result.length- 1; i >= 0; i--) 
			 {
				//Reverse logic
		 		char s = result[i];
				System.out.print(s);
			}
	
	 
	 	}
		
}

/*//	String []result11 = a.split(" ");// Space eliminated
for(int k = 0; k<result11.length;k++)
	{
		System.out.println(result11[k]);// Spaces removed
	}
*/ 


/*"Velocity";
		String b = "class";
		String c = "pune";
		String d = "started";
		String e = "in";
		String f = "October"; */


/*
 * String x = "My Space Class";
		String y ="";
		for(int i = x.length()-1;i>=0;i--) {
			y = y + x.charAt(i);
		}
		System.out.println(y);
		
	}*/
