package multithreading.threads;

/**
 * 
 * @author RohitMagdum
 * 
 * 
 *         *CreatingThreadsUsingDifferentCases==> performing single task from
 *         single thread performing single task from multiple thread performing
 *         multiple task from single thread==> Not Possible performing multiple
 *         task from multiple thread
 * 
 * 
 */

public class CreatingThreadsUsingDifferentCases extends Thread {

	public void run() {
		System.out.println("Thread Tasks");

	}

	// ========================
//	No. of threads==> 3
//	Main is a thread (JVM)
	public static void main(String[] args) {

//		Thread 1
		CreatingThreadsUsingDifferentCases t = new CreatingThreadsUsingDifferentCases();
		t.start();

//		Thread 2
		CreatingThreadsUsingDifferentCases t2 = new CreatingThreadsUsingDifferentCases();
		t2.start();

//		==================================

//		performing multiple task from multiple thread
		MyThread1 mt1 = new MyThread1();
		mt1.start();

		MyThread2 mt2 = new MyThread2();
		mt2.start();

//		NOTE: Execution is depend on JVM /algorithams of thread scheduler
	}
}

class MyThread1 extends Thread {
	public void run() {
		System.out.println("task 01");
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("task 02");
	}
}
