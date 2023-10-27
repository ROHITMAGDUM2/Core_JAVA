package OOPS.methods;

class Overloading extends Ex02{
	
	int x = 10;
	int y = 20;
	
	public void m1() {
		
		System.out.println(x+" "+y);
	}
	
//	using type
	public void m1(int a) {
		
		System.out.println(a);
		this.m1();
	}
	
//	size.of parameter list, Different Parameters
	public void m1(int a , String b, float c) {
		
		System.out.println(a+" "+b+" "+c);
		this.m1(a);
	}
	
//	same types and changing position datatypes
	public void m1(String b, int a) {
		
		System.out.println(b +" "+a);
		this.m1(a, b, a);
	}
	
}



public class _01_MethodOverloading {

	public static void main(String[] args) {
		 
		Overloading o = new Overloading();
		o.m1("Pune",100);
		
	}

}
