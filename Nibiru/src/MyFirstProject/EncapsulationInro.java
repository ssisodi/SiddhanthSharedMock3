package MyFirstProject; // package name ---> always start with lowercase

public class EncapsulationInro {
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setPrice(21);
		
		System.out.println(l1.getPrice());
		
		}
	 void doWork() { // by default, the type is private (only accessible in class, not even package)
		System.out.println("Start working!");
	}
	 
	 
}

class Laptop{
	 int ram;
	 private int price;
	 
	 public void setPrice(int price) {
		 // allow only if user is admin
		 this.price = price;
	 }

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	 
	 
}


