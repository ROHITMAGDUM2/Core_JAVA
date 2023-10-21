package multithreading.cases;

//performing single task from multiple thread

class MyThread extends Thread {
//	task
	public void run() {
		System.out.println("Single Task 01");
	}
}

public class SingleTaskFromMultipleThread {
// main is a thread by JVM
	public static void main(String[] args) {

//		1st thread
		MyThread th1 = new MyThread();
		th1.start();

//		2nd thread
		MyThread th2 = new MyThread();
		th2.start();
	}

}
