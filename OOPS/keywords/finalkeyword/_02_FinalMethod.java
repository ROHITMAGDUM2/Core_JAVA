package OOPS.keywords.finalkeyword;

/**
 * 
 * @author RM
 * 
 * Final Method:
 *  If we create any final method, we can not override it
 *
 */

class UseFinalMethod{
	// it con not be override
	final void show() { 
		System.out.println("I am final Method");
	}
}
class TestFinalMethod extends UseFinalMethod{
//	public void show() {// IncompatibleClassChangeError: TestFinalMethod overrides final method
//		System.out.println("FinalMethod Show Override in test class");
//	}
}

public class _02_FinalMethod {

	public static void main(String[] args) {
		TestFinalMethod t =new TestFinalMethod();
		t.show();
	}

}
