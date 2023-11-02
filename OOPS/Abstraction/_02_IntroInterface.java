package OOPS.Abstraction;

//Interface Name
public interface _02_IntroInterface {
	
//	fields ==> by default "public static final"
	int a=10;
	
//	methods==> by default "public abstract"
	void m1();
	
//	Java 8 versions 
//	Default Concurent Method ( which have body)
	default void m2() {
		m4();  //can call private method 
		System.out.println("This is Default Concurent Method");
	}
	
//	Static Concurent Method
	static void m3() {
		System.out.println("Static Concurrent Method");
	}
	
//	Java 9 version
//	private method
	// (used to assist the default method)
	private void m4() {
		System.out.println("Private method in interface");
	}
}
