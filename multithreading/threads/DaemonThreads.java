package multithreading.threads;

/**
 * 
 * @author RM
 * 
 * 1. DEf=> Which run in background of another thread
 * 
 * 2. use=> It provides service to the threads
 * 
 * 3. e.g => Garbage collection, finalizer, attach Listener, signal dispacher etc
 * 
 * 4. Methods =>  
 * public final void setDaemone(boolean b)
 * public final boolean isDaemon()
 * 
 * 5. Note:1. We have to cerate demone thread before starting the thread
 *      if we create daemone thread after starting it, it will throw runtime exception ie. ~IlligalStateException~
 *      
 *     2. We can not create main thread as daemon thread
 *     
 * 6. Life => depeends on another thread
 * 7. Daemon Nature => It inherits the nature / Property from its parents thread
 * 
 * 8. JVM Roll in Daemon => not depend on Daemon thread it shout down when all normal thread are dead 
 * 
 * 9. most of the times daemon thread has low priorities. but we can change its priority according to our need. 
 */
class Test implements Runnable{
	public void run() {
//		checking thread Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}else {
			System.out.println("Child Thread");
		}
	}
}

public class DaemonThreads {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Test t = new Test();
		Thread th= new Thread(t);
		th.setDaemon(true);
		th.start();
//		th.setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
	}

}
