package Casting;

public class Implicitcast {
	public static void main(String[] args) {
		  byte a = 20; // 1 byte memory space // 8 bits // -128 to 127
		  short t; // 2 byte memory space // 16 bits
		 
		// Implicit casting: No data changed but space used is from 1 byte to 2 bytes.
		  t = a;
		// We're transferring the data from byte b to Short t
		  System.out.println("*****IMPLICIT CASTING*****");
		  System.out.println("                                                                ");
		  System.out.println("---No data changed but space used is from 1 byte to 2 bytes---");
		  System.out.println("                                                                ");
		  System.out.println("Value of 'a' used the memory space of 1 byte: "+ a);
		  System.out.println("Value of 't' used the memory space of 2 bytes: "+ t);
		 
		  System.out.println("---------------------------------------------------------------"); // Blank space for separation
		//------------------------------------------------------------------------------------------------
		  // Implicit casting: No data changed but only the representation changed.
		  double e = a; 
		  // We're transferring the data from 1 byte to 8 bytes// 64 bits
		  System.out.println("---No data changed but only the representation changed---");
		  System.out.println("                                                                ");
		  System.out.println("Value of 'a' used the memory space of 1 byte: " + a);
		  System.out.println("Value of 't' used the memory space of 8 bytes: " + e);
		 
		  System.out.println("---------------------------------------------------------------"); // Blank space for separation
		//------------------------------------------------------------------------------------------------  
		  // Implicit casting: No data changed, no size changed but only representation changed.
		  int b = 10; // 4 byte
		  float g; // 4 byte
		  g = b; // Value of int is transferred to float (non-decimal to decimal)
		  // We're transferring the Int value of 4 byte to float value of 4 byte
		  System.out.println("---No data changed, no size changed but only representation changed---");
		  System.out.println("                                                                ");
		  System.out.println("Value of 'b' used the memory space of 4 bytes: "+ b);
		  System.out.println("Value of 'g' used the memory space of 4 bytes: "+ g);
		}
	}