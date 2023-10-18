package keywords.thiskeyword;

public class UsingThis {
	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.mouse();
	}
}
class Laptop{
	void mouse() {
		System.out.println("This is a Mouse");
		this.keyboard();
	}
	void keyboard() {
		System.out.println("This is a keyBoard");
		this.moniter();
	}
	void moniter() {
		System.out.println("This is a Moniter");
		this.memory();
	}
	void memory() {
		System.out.println("This is a Memory");
		
	}
}
