package operators;

public class MaxArithmaticOperater {
	public static void main(String[] args) {
		
//		if you apply any arithmetic operater in two varible 
//		the result type is always [max(int,type of a , type of b]
		
//		 byte < short < int < long < float < double
//		 char < int
		
		
//		======================
//		byte + byte = int;
//		byte + short = int;
//		short + short = int;
//		byte + long = long;
//		long + double = double;
//		float + long = float;
//		char + char = int;
//		char + double = double;
		
//		========================
//		System.out.println(10/0);
//		System.out.println(10/0.0);
//		System.out.println(0/0);
//		System.out.println(0.0/0);
		
//		 op= RE: AE= / by zero
		
		
		//===========================================
		 
		System.out.println(10 <= Float.NaN);  // false
		System.out.println(10 < Float.NaN);   // false
		System.out.println(10 > Float.NaN);   //false
		System.out.println(10 >= Float.NaN);  //false
		System.out.println(10 == Float.NaN);  //false
		System.out.println(10 != Float.NaN);  //true
		System.out.println(Float.NaN != Float.NaN); //true
		
		
		
		
	}
}
