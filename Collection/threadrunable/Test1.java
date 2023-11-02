package threadrunable;

public class Test1 {
	
	public static void main(String[] args) {
		
		System.out.println("MAin Start");
		TreadRunnableClass t1=new TreadRunnableClass("Email");
		
		t1.t.run();
		
		System.out.println("Main stop");
	}

}
