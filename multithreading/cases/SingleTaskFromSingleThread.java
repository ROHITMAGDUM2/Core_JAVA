package multithreading.cases;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Single Task 01");
	}
}

public class SingleTaskFromSingleThread {

	public static void main(String[] args) {
		Thread1 th = new Thread1();
		th.start();
	}

}
