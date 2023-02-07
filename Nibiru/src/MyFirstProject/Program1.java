package MyFirstProject;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		/*
		 * Program to take integer as input from user 
		 * and print it
		 * 
		 * https://www.geeksforgeeks.org/how-to-read-and-print-an-integer-value-in-java/
		 */
		System.out.println("Please enter a number: ");
		
		Scanner inputObject = new Scanner(System.in);
		int userNumber = inputObject.nextInt();
		
		System.out.println("The number entered by the user is: "+userNumber);

	}

}
