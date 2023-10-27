package OOPS.methods;

public class MethodClass {

	// non static method ==> Instance Method
//	int nonStaticMethod(int a, int b) {//ClassObject.methodName(argument); //invocation
//		int c=a*b;
//		return c ;
//	}
	
	static String staticMethod(int x, String y) {
		
		return x+y;
	}

	public static void main(String[] args) {
		MethodClass nsc = new MethodClass();
		
		//System.out.println(nsc.nonStaticMethod(-200,300));
		
		System.out.println(MethodClass.staticMethod(10,"Payas"));
		
		
	}
}
