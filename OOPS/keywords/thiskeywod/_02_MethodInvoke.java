package OOPS.keywords.thiskeywod;

// 2. this can be used to invoke current class method (Implicityly)

class Task {
	void display(){
		System.out.println("I am doing Something in Display Method");
	}
	void doSomething() {
//		display();
		this.display();
	}
}

public class _02_MethodInvoke {
	public static void main(String[] args) {
		Task t= new Task();
		t.doSomething();
	}
}
