package multithreading.cases;


class MyThread03 extends Thread{
//	task1
	public void run() {
		System.out.println("Task 01");
	}
}

class Thread2 extends Thread{
//	task2
	public void run() {
		System.out.println("Task 02");
	}
}

class Thread3 extends Thread{
//	task3
	public void run() {
		System.out.println("Task 03");
	}
}

class Thread4 extends Thread{
//	task4
	public void run() {
		System.out.println("Task 04");
	}
}

public class MultipleTaskFromMultipleThread {
	public static void main(String[] args) {
		MyThread03 th1 = new MyThread03();
		th1.start();
		
		Thread2 th2 = new Thread2();
		th2.start();
		
		Thread3 th3 = new Thread3();
		th3.start();
		
		Thread4 th4 = new Thread4();
		th4.start();
	}
}
