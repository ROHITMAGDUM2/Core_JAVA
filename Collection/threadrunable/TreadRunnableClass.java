package threadrunable;

public class TreadRunnableClass implements Runnable {
		
	Thread t;
	String name;
	
	public TreadRunnableClass(String s) {
		name=s;
		t=new Thread(this, name);
	}

	@Override
	public void run() {
			System.out.println(" hello");
	}
	
	
	
}
