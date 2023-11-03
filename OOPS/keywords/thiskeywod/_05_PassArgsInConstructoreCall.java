package OOPS.keywords.thiskeywod;

// 5. this can be use to pass an arguments in the Constructore call

class Ground{
	Ground(Pary pary){
		System.out.println("I am In Ground class Constructore");
	}
}
class Pary{
	void goTo() {
	Ground g= new Ground(this);
	}
}

public class _05_PassArgsInConstructoreCall {

	public static void main(String[] args) {
		
		Pary p =new Pary();
		p.goTo();
	}

}
