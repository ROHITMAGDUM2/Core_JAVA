package inheritance;

//
abstract class AClass{
	abstract void displayA();
}
class BClass extends AClass{//IS-A
	void displayA() {
		System.out.println("class B Mthod A");
	}
	
	void displayB() {
//		AClass ac = new AClass();//HAs-A
//		ac.displayA();
		
		System.out.println("B Class");
	}
}


public class _06_RelationshipInClass {

	public static void main(String[] args) {
			BClass b2=new BClass();
			b2.displayA();
			b2.displayB();
//			b2.displayA();
			
	}

}
