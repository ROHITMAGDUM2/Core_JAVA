package inheritance;

/**
 * Son===>Father,Mother
 * 
 */
class Father1{
	void fatherProperty() {
		System.out.println("Father Property");
	}
}
class Mother{
	void motherProperty() {
		System.out.println("Mother Property");
	}
}

class Son1 extends Father1  //,Mother //only one class is inherited 
{
	void sonProperty() {
		System.out.println("Son Property");
	}
}

public class _05_MultipleInheritance {

	public static void main(String[] args) {
		Son1 s1 =new Son1();
		s1.sonProperty();
		s1.fatherProperty();
	}

}
