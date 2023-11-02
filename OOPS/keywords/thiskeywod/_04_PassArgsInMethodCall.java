package OOPS.keywords.thiskeywod;

// 4. this can be use to pass an arguments in the method call

class Sim{
	void call(Sim company) {
		System.out.println("I have Airtel Sim");
	}
	void Store() {
		call(this);
	}
}

public class _04_PassArgsInMethodCall {

	public static void main(String[] args) {
		
		Sim sim =new Sim();
		sim.Store();
	}

}
