package Casting;

public class Explicitcast {

	public static void main(String[] args) {
		
		short a = 120; // 2 bytes - 16 bits
		byte t; // 1 bytes - 8 bits
				
		t = (byte)a; // data in 2 bytes is stored in 1 byte 
		/*Syntax for explicit casting is by using the Datatype 
		 * of the variable we're passing the value in.*/
		System.out.println("*****EXPLICIT CASTING*****");
		System.out.println("                                                                ");
		System.out.println("---No data changed but space used is from 2 byte to 1 byte---");
		System.out.println("                                                                ");
		System.out.println("Value of 'a' used the memory space of 2 byte: "+a);
		System.out.println("Value of 't' used the memory space of 1 byte: "+t);
		/* value of a short is transferred 
			conveniently into value */ 
		
//---------------------------------------------------------------------------
		short b = 130; // 2 byte - 16 bits 
		
		t = (byte)b; // data in 2 bytes is stored in 1 byte 
		/*Explicit  for explicit casting is by using the Datatype 
		 * of the variable we're passing the value in.*/
		System.out.println("                                                                ");
		System.out.println("---Data changed but space used is from 2 byte to 1 byte---");
		System.out.println("                                                                ");
		System.out.println("Value of 'b' used the memory space of 2 byte: " +b); 
		System.out.println("Value of 't' used the memory space of 1 byte: "+t); 
		// Why did value of t come to -126???
		/* 127-130 = -3 (data loss happened here)
		 * -128 + 3 = - 125 - 1 (-1 __ 0 __+1)
		 * Final answer = -126 */
//---------------------------------------------------------------------------
		short c = 125; 
		
		t = (byte)c;
		System.out.println("Value of 'a' used the memory space of 2 byte: "+c);
		System.out.println("Value of 't' used the memory space of 1 byte: "+t);		
	}
}
