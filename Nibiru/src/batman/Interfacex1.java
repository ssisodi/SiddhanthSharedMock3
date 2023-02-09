package batman;
// Single Inheritance for interface 
interface amigo
{
	int a = 10; 
	void disp();
}

public class Interfacex1 implements amigo {

	public void disp()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		amigo Xmen = new Interfacex1();
		Xmen.disp();
	}

}
