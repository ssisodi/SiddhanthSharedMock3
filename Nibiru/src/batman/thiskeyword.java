package batman;

public class thiskeyword 
	{

	int a,b; 
	
	void getvalue(int a, int b)
	{
		this.a = a; 
		this.b = b; 
	}
	
	void printvalue()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
public static void main(String[] args) 
{
	thiskeyword th = new thiskeyword();
	th.getvalue(10,20);
	th.printvalue();
}

}
