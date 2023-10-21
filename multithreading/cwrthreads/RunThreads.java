package multithreding.cwrthreads;

public class RunThreads {
	public static void main(String[] args) {
		MyThread1 mt1= new MyThread1();
		
		mt1.start();
		
		mt1.run();// its a normal method not a Thread 
		
	}
}
