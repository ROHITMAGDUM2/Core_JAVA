package methods;

public class Ex$01Method {
	
	static int a = 10;
	int b = 20;
	
	void make() {
		
		System.out.println("This A first Non-Static Method.");
	}

	static void display1(){
		
		System.out.println("This Is Statis Display1 Method");
	}
	
	{
		System.out.println("This Is Instance Anonnamus Method");
	}
	
	static {
		System.out.println("This A First Static Method.");
	}
	
	static {
		System.out.println(a);
	}
	
	{
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		Ex$01Method m = new Ex$01Method();
		
		m.make();
		display1();
	}
}
