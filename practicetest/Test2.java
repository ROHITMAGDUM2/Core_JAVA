

package practicetest;

	//A.java
	class A{
		public void print() {
			System.out.println("A");
		}
	}
	
	//B.java
	class B extends A{
		public void print() {
			System.out.println("B");
		}
	}
public class Test2{
	public static void main(String[] args) {
		
		A obj1= new A();
		B obj2= (B)obj1;
		obj1.print();
	}}





//ClassCastException is thrown at runtime