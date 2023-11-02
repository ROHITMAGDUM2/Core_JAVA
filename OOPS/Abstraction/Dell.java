package OOPS.Abstraction;

public class Dell implements Laptop{
	
	public void software() {
		
		System.out.println("Windows software");
	}
	
	public static void main(String[] args) {
		Dell l = new Dell();
		l.software();
	}
	
}