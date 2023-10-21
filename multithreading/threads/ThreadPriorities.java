package multithreading.threads;
/** 
 * @author RM
 *
 * Priorities in Thread 
 * 1. JVM Provide the priorities to each thread and according to these priorities JVM allocate the processor
 * 2. Priorities are represented in form of integer value which range from 1-10.
 * 1 --> MIN_PRIORITY
 * 5 --> NORM_PRIORITY
 * 10--> MAX_PRIORITY 
 * 
// * Below are not the priorities
 * 0 <1, >10
 * minimum_priority
 * low_proirity
 * normal_priority
 * maximum_priority
 * high_priority
 *====================
 *
 *public final void setPriority(int value);
 *public final int getPriority();
 *
 *NOTE: 
 * Default Nature : Priorities are inherits from parent thread
 * by default main thread priority is 5 (NORM_PRIORITY)
 * If priority value is not bwtn 1-10, then it will throw run time exception ie.IlligleArgumentException
 * 
 * Prioritys depends on the plateform (windows does not support priorites)
 * 
 * */

class Test1 extends Thread{
	public void run() {
		System.out.println("Child Thread");
		System.out.println("Child Thread priority "+Thread.currentThread().getPriority());
	}
}

public class ThreadPriorities {

	public static void main(String[] args) {
		System.out.println("Main thrad old Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Main thrad new Priority "+Thread.currentThread().getPriority());
		Test1 t = new Test1();
		t.setPriority(1);
		t.start();
	}

}
