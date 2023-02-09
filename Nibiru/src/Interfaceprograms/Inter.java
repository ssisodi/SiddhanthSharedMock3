package Interfaceprograms;
// Super class
interface Inter {
	//No constructor 
 
	void Pranil();//Abstract method
	
	 void meth();//Abstract method
	 //jdk 1.8
	default void Ninja() // Override able
	 {	// complete method
		 System.out.println("Zen");
	 }
}


