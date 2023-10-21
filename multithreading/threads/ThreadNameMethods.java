package multithreading.threads;

class UserThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("User Deffinered Thread 01 " + Thread.currentThread().getName());
	}
}

public class ThreadNameMethods {
	
	public static void main(String[] args) {
		
		System.out.println("Hello "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Rohit");
		System.out.println("New Thread Name= "+Thread.currentThread().getName());
		
	 UserThread ut =new UserThread();
	 ut.start();
	 
	 UserThread ut2 =new UserThread();
	 ut2.start();
	 System.out.println(Thread.currentThread().isAlive());
	 System.out.println(ut.isAlive());
	}

}
