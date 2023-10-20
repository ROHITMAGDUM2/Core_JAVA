package OOPS.methods;

public class MethodTypes {

	/**
	 * Method 1. Static Method ==> Non- Instance Method ==> Class Name( Calling) 2.
	 * Non-Static Method ==> Instance Method ==> Object/Instance (calling)
	 *
	 * 
	 * 
	 * 
	 * class* main object ==> Instance
	 */

	//
	// AM =>retunType
	public static void display(int a, int b, char c, String _a) {
		System.out.println(_a + b + c + a);// abc2a1
		System.out.println("a");
		return;
		// 100+abc===> 100abc
		// abc2a1
	}

	public static void main(String[] args) {

		MethodTypes.display(1, 2, 'a', "abc");

		MethodTypes mt = new MethodTypes();

		// MethodTypes.display(11, 110, 'a', "asss");
	}
}
