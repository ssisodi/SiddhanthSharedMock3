package Basicprograms;

class bosman{
float mul;
	void result(float d, float e)
	{
		mul = d * e; 
		System.out.println(mul);
	}
}


public class Reed {

	public static void main(String[] args) 
	{
		bosman bs = new bosman();
		// f is to ensures that numbers are float DATA TYPE
		bs.result(10.2f, 11.2f);
		
	}
}
