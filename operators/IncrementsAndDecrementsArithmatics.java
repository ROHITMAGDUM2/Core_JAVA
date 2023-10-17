package operators;

public class IncrementsAndDecrementsArithmatics {

	public static void main(String[] args) {
		
		int x = 10;
		int y = ++x;
		System.out.println(y);
//		o/p =11
		//==============================
		
//		y= ++10;
//		System.out.println(y);
//		o/p= Invalid argument to operation ++/--
		//===============================
//		
//		y= ++(++x);
//		System.out.println(y);
//		o/p= Invalid argument to operation ++/--
		//================================
		
		x++;
		System.out.println(x);
//		o/p =12
		//=================================
		
		char ch = 'a';
		ch++;
		System.out.println(ch); 
//		o/p= b
		//===================================
		
		double d =10.5;
		d++;
		System.out.println(d);
//		o/p= 11.5
		//=====================================
		
//		boolean b = true;
//		b++;
//		System.out.println(b);
//		o/p =Type mismatch: cannot convert from boolean to int

		//======================================
		
//		we can apply increment operator for every primitive type except boolean
		
		byte b=20;
//		b=b+1; 
		System.out.println(b);
		// o/p = Type mismatch: cannot convert from int to byte
		//=======================================
		
		b++;// internal type casting
		System.out.println(b);
//		o/p= 11
		//========================================
		
//		if you apply any arithmetic operator  variable a and b the result of alaways
//		(max of int, type of a,type of b)
//		ex:
		
		//========================================
		
//		byte a= 10;
//		byte c= a+b;  // op= Type mismatch: cannot convert from int to byte
//		sSystem.out.println(c);
		
		b=(byte)(b+1);// external type casting
		System.out.println(b);//22
		//========================================

			
		
	}

}
