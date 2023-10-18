package operators;

public class LogicalOperators {
public static void main(String[] args) {
	
	int a = 10 , b= 20;
	
//	!(b==a)   =============> !False === true
	/*
	 * //&& System.out.println(a>b && a>=b);
	 * 
	 * boolean c; c= a<b && b>a;
	 * 
	 * System.out.println(c);
	 * 
	 * //||
	 * 
	 * c = a<b || b<a; System.out.println(c);
	 * 
	 * 
	 * c = a<b || b==a;// System.out.println(c);
	 * 
	 */
	boolean c = a<b &&  !(b==a); 
	System.out.println(c);
	
	
	
	
}
}
